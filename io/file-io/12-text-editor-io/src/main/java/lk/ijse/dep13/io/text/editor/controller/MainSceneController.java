package lk.ijse.dep13.io.text.editor.controller;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
            if (newValue){
                if (!getTitle().endsWith("*")) setTitle(getTitle() + " *");
            }else{
                if (getTitle().endsWith("*")) setTitle(getTitle().substring(0, getTitle().length() -2));
            }
        });
    }

    private void setTitle(String title){
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setTitle(title);
    }

    private String getTitle(){
        Stage stage = (Stage) root.getScene().getWindow();
        return stage.getTitle();
    }

    public void initCurrentFile(File currentFile) {
        this.currentFile = currentFile;
    }

    public void mnExitOnAction(ActionEvent event) {

    }

    public void mnNewOnAction(ActionEvent event) {
        if (updateProperty.get()){
            Optional<ButtonType> buttonType = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to create a new document?\nAny unsaved changes will be discarded", ButtonType.YES, ButtonType.NO).showAndWait();
            if (buttonType.get() == ButtonType.NO) return;
        }
        txtEditor.clear();
        currentFile = null;
        setTitle("Text Editor - New Document");
        updateProperty.set(false);
    }

    public void mnOpenOnAction(ActionEvent event) {
        if (updateProperty.get()){
            Optional<ButtonType> buttonType = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to open a new document?\nAny unsaved changes will be discarded", ButtonType.YES, ButtonType.NO).showAndWait();
            if (buttonType.get() == ButtonType.YES){
                txtEditor.clear();
            }else return;
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
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
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

    }

    public void mnSaveAsOnAction(ActionEvent event) {

    }

    public void mnSaveOnAction(ActionEvent event) {

    }

}
