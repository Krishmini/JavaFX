package appli.todolistjx.accueil;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class InscriptionController {

    @FXML
    private Label errorLabel;

    @FXML
    private Button handleInscription;

    @FXML
    private Button handleCancel;

    @FXML
    private TextField usernameField; // Nom d'utilisateur
    @FXML
    private TextField prenomField; // Prénom
    @FXML
    private TextField emailField; // Email
    @FXML
    private PasswordField passwordField; // Mot de passe
    @FXML
    private PasswordField confirmPasswordField; // Confirmation mot de passe

    @FXML
    protected void handleInscription() {
        String username = usernameField.getText();
        String prenom = prenomField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (username.isEmpty() || prenom.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            errorLabel.setText("Veuillez remplir tous les champs.");
            return;
        }

        if (!password.equals(confirmPassword)) {
            errorLabel.setText("Les mots de passe ne correspondent pas.");
            return;
        }

        // Logique pour enregistrer l'utilisateur ici
        System.out.println("Inscription réussie pour : " + username);
        errorLabel.setText("Inscription réussie !");

        // Réinitialiser les champs
        usernameField.clear();
        prenomField.clear();
        emailField.clear();
        passwordField.clear();
        confirmPasswordField.clear();
    }

    @FXML
    protected void handleCancel() {
        usernameField.clear();
        prenomField.clear();
        emailField.clear();
        passwordField.clear();
        confirmPasswordField.clear();
        errorLabel.setText("");
    }
}

