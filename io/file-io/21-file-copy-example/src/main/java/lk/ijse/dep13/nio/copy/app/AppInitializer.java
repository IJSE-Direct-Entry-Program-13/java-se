package lk.ijse.dep13.nio.copy.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("File Copy App");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/scene/MainScene.fxml"))));
        stage.setResizable(false);
        stage.show();
        stage.centerOnScreen();
    }
}
