package lk.ijse.dep13.io.file.explorer.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;

public class MainSceneController {
    public AnchorPane root;
    public TreeView<String> trExplorer;
    public Button btnLoad;
    public TextField txtLocation;

    public void initialize() {
        txtLocation.setText(System.getProperty("user.home"));
        btnLoad.fire();
    }

    public void btnLoadOnAction(ActionEvent actionEvent) {
        File location = new File(txtLocation.getText().strip());
        if (!location.exists()) {
            new Alert(Alert.AlertType.ERROR, "Invalid location").showAndWait();
            txtLocation.requestFocus();
            txtLocation.selectAll();
            return;
        }
        if (!location.isDirectory()) {
            new Alert(Alert.AlertType.ERROR, "Location should be a directory").showAndWait();
            txtLocation.requestFocus();
            txtLocation.selectAll();
            return;
        }

        ImageView openFolderIcon = new ImageView(new Image("/icon/open-folder.png",
                32, 32, true, true));
        TreeItem<String> rootItem = new TreeItem<>(location.getAbsolutePath(), openFolderIcon);
        rootItem.setExpanded(true);
        trExplorer.setRoot(rootItem);
        loadContent(location, rootItem);
    }

    private void loadContent(File directory, TreeItem<String> parentTreeItem) {
        if (!directory.isDirectory()) return;

        Image fileIcon = new Image("/icon/file.png", 32, 32, true, true);
        Image folderIcon = new Image("/icon/folder.png", 32, 32, true, true);
        Image openFolderIcon = new Image("/icon/open-folder.png", 32, 32, true, true);

        File[] pointers = directory.listFiles();
        for (File pointer : pointers) {
            TreeItem<String> treeItem = new TreeItem<>(pointer.getName(),
                    pointer.isDirectory() ? new ImageView(folderIcon) : new ImageView(fileIcon));
            parentTreeItem.getChildren().add(treeItem);
            if (pointer.isDirectory() && pointer.list().length > 0) {
                treeItem.getChildren().add(new TreeItem<>("Dummy"));
            }

            treeItem.expandedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue) {
                    treeItem.getChildren().clear();
                    loadContent(pointer, treeItem);
                }
                treeItem.setGraphic(newValue ? new ImageView(openFolderIcon) : new ImageView(folderIcon));
            });
        }
    }
}
