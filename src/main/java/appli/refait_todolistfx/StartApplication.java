package appli.refait_todolistfx;

import appli.refait_todolistfx.accueil.InscriptionController;
import appli.refait_todolistfx.accueil.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {
    private static Stage mainStage;

    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }
    public static void changeScene(String LoginController) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource(LoginController));
        Scene scene = new Scene(fxmlLoader.load());
        mainStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}