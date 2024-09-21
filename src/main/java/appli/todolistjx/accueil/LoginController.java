package appli.todolistjx.accueil;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onConnexionButtonClick() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Veuillez remplir les champs");
        } else {
            errorLabel.setText("");
        }
        System.out.println("Connexion : " + email);
        welcomeText.setText(" réussie !");
    }

    @FXML
    protected void onMotDePasseOublieButtonClick() {
        System.out.println("Mot de passe oublié");
        errorLabel.setText("");
    }

    @FXML
    protected void onInscriptionButtonClick() {
        System.out.println("Inscription");
        errorLabel.setText("");
    }
}