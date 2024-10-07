package appli.refait_todolistfx.accueil;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
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
    private Button connexion;

    @FXML
    private Button motDePasseOublie;

    @FXML
    private Button inscription;

    @FXML
    public void connexion() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.equals("test@test.com") && password.equals("1234")) {
            System.out.println("Connexion réussie");
            errorLabel.setVisible(false);
        } else {
            System.out.println(">Erreur");
            errorLabel.setText("Email ou mot de passe incorrect");
            errorLabel.setVisible(true);
        }
    }

    public void inscription(){
        System.out.println("Inscription");
    }

    public void motDePasseOublie(){
        System.out.println("Mot de passe oublié");
    }
}