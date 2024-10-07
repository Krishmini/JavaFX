package appli.refait_todolistfx.accueil;

import appli.refait_todolistfx.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class InscriptionController {

    public Button inscriptionButton;
    public Button retourButton;
    @FXML
    private TextField nomField;

    @FXML
    private TextField prenomField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmationField;

    @FXML
    private void handleInscription(ActionEvent event){
        System.out.println("Inscription réussie +" + nomField.getText());
    }

    @FXML
    private void handleRetour(ActionEvent event) throws IOException{
        StartApplication.changeScene("InscriptionController.fxml");
    }




}
