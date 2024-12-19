package lk.ijse.dep13.nio.copy.app.controller;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MainSceneController {

    public Button btnBrowseDestination;
    public Button btnBrowseSource;
    public Button btnCopy;
    public Label lblStatus;
    public ProgressBar pgCopy;
    public TextField txtDestination;
    public TextField txtSource;
    public AnchorPane root;

    public void btnBrowseDestinationOnAction(ActionEvent event) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Select Destination Directory");
        File directory = directoryChooser.showDialog(root.getScene().getWindow());
        if (directory == null) txtDestination.clear();
        else txtDestination.setText(directory.getAbsolutePath());
    }

    public void btnBrowseSourceOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Source File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("All Files (*.*)", "*.*"));
        File file = fileChooser.showOpenDialog(root.getScene().getWindow());
        if (file == null) txtSource.clear();
        else txtSource.setText(file.getAbsolutePath());
    }

    public void btnCopyOnAction(ActionEvent event) {
        if (txtSource.getText().isBlank()) {
            new Alert(Alert.AlertType.ERROR, "Please select a source file").showAndWait();
            btnBrowseSource.requestFocus();
            return;
        } else if (txtDestination.getText().isBlank()) {
            new Alert(Alert.AlertType.ERROR, "Please select a destination directory").showAndWait();
            btnBrowseDestination.requestFocus();
            return;
        }

        Task copyTask = new Task<Void>() {

            @Override
            protected Void call() throws Exception {
                Path source = Path.of(txtSource.getText());
                Path target = getTargetFilePath(source);

                FileChannel fcSource = FileChannel.open(source);
                Files.createFile(target);
                FileChannel fcTarget = FileChannel.open(target, StandardOpenOption.APPEND);
                ByteBuffer buffer = ByteBuffer.allocate(1024 * 10);
                int read;
                while ((read = fcSource.read(buffer)) != -1) {
                    fcTarget.write(buffer);
                    buffer.clear();
                    updateProgress(read / fcSource.size() * 100, 100);
                }
                updateProgress(100, 100);
                fcSource.close();
                fcTarget.close();
                return null;
            }
        };

        copyTask.progressProperty().addListener((observable, oldValue, newValue) -> {
            lblStatus.setText("Copied %.0f%%".formatted(newValue.doubleValue() * 100));
        });
        copyTask.setOnSucceeded(e -> {
            new Alert(Alert.AlertType.INFORMATION, "Copied successfully").showAndWait();
            txtSource.clear();
            txtDestination.clear();
            btnBrowseSource.requestFocus();
            pgCopy.progressProperty().unbind();
            pgCopy.setProgress(0);
            lblStatus.setText("Not Started");
        });
        copyTask.setOnFailed(e -> {
            new Alert(Alert.AlertType.ERROR, "Failed to copy, try again").showAndWait();
            System.out.println(e.getTarget());
        });
        pgCopy.progressProperty().bind(copyTask.progressProperty());
        new Thread(copyTask).start();
    }

    private Path getTargetFilePath(Path source) {
        String fileName = source.getFileName().toString();
        Path target = Path.of(txtDestination.getText(), fileName);
        while (Files.exists(target)) {
            target = Path.of(txtDestination.getText(), fileName = fileName + " (copy)");
        }
        return target;
    }

}
