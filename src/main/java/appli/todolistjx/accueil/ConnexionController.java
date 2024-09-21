package appli.todolistjx.accueil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ConnexionController {

    @FXML
    private Label errorLabel;

    @FXML
    private Button handleCancel;

    @FXML
    private Button handleConnexion;

    @FXML
    private Button handleInscription;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    protected void handleConnexion() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Veuillez remplir tous les champs.");
        } else {
            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("Connexion réussie avec : " + username);
            } else {
                errorLabel.setText("Nom d'utilisateur ou mot de passe incorrect.");
            }
        }
    }

    @FXML
    protected void handleCancel() {
        usernameField.clear();
        passwordField.clear();
        errorLabel.setText("");
    }

    @FXML
    protected void handleInscription() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("inscriptionView.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) handleInscription.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

