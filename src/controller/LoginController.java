package controller;

import javafx.collections.transformation.TransformationList;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class LoginController {
    public PasswordField txtPassword;
    public Label lblerror;
    public AnchorPane acLogin;
    public javafx.scene.control.Button btnLogin;
    private JFXPanel root;
    String num = "0000";

    public void btnLogin(ActionEvent event) throws IOException {
       
        if(txtPassword.getText().equals(num)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Dashbord.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                // Get the current window
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                // Close the previous window
                currentStage.close();
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if(txtPassword.getText().isEmpty()){
            lblerror.setText("Please Enter PIN");
            System.out.println("Enter PIN");
        }else if (!(txtPassword.getText().equals(num))){
            lblerror.setText("Invalid PIN");
        }
    }

    public void btnUrl(ActionEvent actionEvent) throws URISyntaxException, IOException {
        System.out.println("Face book Link Clicked!");
        Desktop.getDesktop().browse(new URI("http://solutech.ezyro.com/"));
    }

    public void txtPin(ActionEvent event) {
        if(txtPassword.getText().equals(this.num)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Dashbord.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                // Get the current window

                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                // Close the previous window
                currentStage.close();
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if(txtPassword.getText().isEmpty()){
            lblerror.setText("Please Enter PIN");
            System.out.println("Enter PIN");
        }else if (!(txtPassword.getText().equals(num))){
            lblerror.setText("Invalid PIN");
        }
    }
}
