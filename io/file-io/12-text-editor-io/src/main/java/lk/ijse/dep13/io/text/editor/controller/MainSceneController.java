package lk.ijse.dep13.io.text.editor.controller;

import javafx.application.Platform;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

public class MainSceneController {

    public MenuItem mnExit;
    public MenuItem mnNew;
    public MenuItem mnOpen;
    public MenuItem mnPrint;
    public MenuItem mnSave;
    public MenuItem mnSaveAs;
    public TextArea txtEditor;
    public AnchorPane root;

    private SimpleBooleanProperty updateProperty = new SimpleBooleanProperty(false);
    private File currentFile;

    public void initialize() {
        txtEditor.textProperty().addListener((observable, oldValue, newValue) -> {
            updateProperty.set(true);
        });

        updateProperty.addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                if (!getTitle().endsWith("*")) setTitle(getTitle() + " *");
            } else {
                if (getTitle().endsWith("*")) setTitle(getTitle().substring(0, getTitle().length() - 2));
            }
        });

        Platform.runLater(() -> {
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setOnCloseRequest(event -> {
                if (updateProperty.get()) {
                    Optional<ButtonType> buttonType = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to exit?\nAny unsaved changes will be discarded", ButtonType.YES, ButtonType.NO).showAndWait();
                    if (buttonType.get() == ButtonType.NO) event.consume();
                }
            });
        });
    }

    private String getTitle() {
        Stage stage = (Stage) root.getScene().getWindow();
        return stage.getTitle();
    }

    private void setTitle(String title) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setTitle(title);
    }

    public void initCurrentFile(File currentFile) {
        this.currentFile = currentFile;
    }

    public void mnExitOnAction(ActionEvent event) {
        ((Stage) (root.getScene().getWindow())).close();
    }

    public void mnNewOnAction(ActionEvent event) {
        if (updateProperty.get()) {
            Optional<ButtonType> buttonType = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to create a new document?\nAny unsaved changes will be discarded", ButtonType.YES, ButtonType.NO).showAndWait();
            if (buttonType.get() == ButtonType.NO) return;
        }
        txtEditor.clear();
        currentFile = null;
        setTitle("Text Editor - New Document");
        updateProperty.set(false);
    }

    public void mnOpenOnAction(ActionEvent event) {
        if (updateProperty.get()) {
            Optional<ButtonType> buttonType = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to open a new document?\nAny unsaved changes will be discarded", ButtonType.YES, ButtonType.NO).showAndWait();
            if (buttonType.get() == ButtonType.YES) {
                txtEditor.clear();
            } else return;
        }
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Text File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text File (*.txt)", "*.txt"));
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("All File (*.*)", "*.*"));
        currentFile = fileChooser.showOpenDialog(root.getScene().getWindow());
        setTitle("Text Editor - " + currentFile.getName());
        loadFileContent(currentFile);
        updateProperty.set(false);
    }

    private void loadFileContent(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            txtEditor.setText(new String(bytes));
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Failed to open the file, try again").show();
        }
    }

    public void mnPrintOnAction(ActionEvent event) {
        PrinterJob printerJob = PrinterJob.createPrinterJob(Printer.getDefaultPrinter());
        printerJob.showPrintDialog(root.getScene().getWindow());
        printerJob.printPage(txtEditor);
    }

    public void mnSaveAsOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Text File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text File (*.txt)", "*.txt"));
        File file = fileChooser.showSaveDialog(root.getScene().getWindow());
        if (!file.getName().endsWith(".txt")) file = new File(file.getAbsolutePath() + ".txt");
        saveContent(file);
        if (currentFile == null) {
            currentFile = file;
            updateProperty.set(false);
            setTitle("Text Editor - " + currentFile.getName());
        }
    }

    public void mnSaveOnAction(ActionEvent event) {
        if (currentFile == null) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Text File");
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text File (*.txt)", "*.txt"));
            currentFile = fileChooser.showSaveDialog(root.getScene().getWindow());
            if (!currentFile.getName().endsWith(".txt")) currentFile = new File(currentFile.getAbsolutePath() + ".txt");
            setTitle("Text Editor - " + currentFile.getName());
        }
        saveContent(currentFile);
        updateProperty.set(false);
    }

    public void saveContent(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(txtEditor.getText().getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Failed to save the file, try again").show();
        }
    }

    public void txtEditorOnDragDropped(DragEvent dragEvent) {
        currentFile = dragEvent.getDragboard().getFiles().getFirst();
        setTitle("Text Editor - " + currentFile.getName());
        loadFileContent(currentFile);
        updateProperty.set(false);
    }

    public void txtEditorOnDragOver(DragEvent dragEvent) {
        if (dragEvent.getDragboard().hasFiles()) {
            dragEvent.acceptTransferModes(TransferMode.ANY);
        }
    }
}
