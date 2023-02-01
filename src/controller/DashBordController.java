package controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

public class DashBordController {
    public PasswordField txtPassword;
    public Label lblDate;
    public Label lblTime;
    @FXML
    public WebView webMapView;
    public WebEngine engine;
    public WebEngine engine2;
    public WebEngine engine3;
    public WebEngine engine4;
    public WebEngine engine5;
    public WebView webviewGallery;
    public WebView WebviewNotification;
   // public WebView watherWebVirw;
    public WebView solaWebView;

    public void initialize(){
        initClock();
        engine = webMapView.getEngine();
        engine2 = webviewGallery.getEngine();
        //engine3 = WebviewNotification.getEngine();
       // engine4 = watherWebVirw.getEngine();
        engine5 = solaWebView.getEngine();
        loadPage();

    }
    public void loadPage(){
        engine.load("https://www.google.lk/maps/place/National+Zoological+Garden+-+Dehiwala/@6.8569172,79.8782166,17z/data=!4m12!1m6!3m5!1s0x3ae25baace050325:0xfd90f5bffd93f59f!2sNational+Zoological+Garden+-+Dehiwala!8m2!3d6.8569811!4d79.8744025!3m4!1s0x3ae25baace050325:0xfd90f5bffd93f59f!8m2!3d6.8569811!4d79.8744025");
        engine2.load("https://unsplash.com/s/photos/animals-zoo");
        //engine3.load("https://edition.cnn.com/2023/01/22/us/dallas-zoo-vulture-death-investigation/index.html");
       //engine4.load("https://www.ventusky.com/");
        engine5.load("https://nationalzoo.gov.lk/zoo/");
    }

    private void initClock() {
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            lblTime.setText(LocalDateTime.now().format(formatter));

            SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            lblDate.setText(formatter2.format(date));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();

    }
    public void btnLogin(ActionEvent actionEvent) {
    }

    public void btnDashAddAnimal(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/AddAnimalForm.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSelectClassification(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/ClassificationFormDashbord.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnViewAll(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/ViewAllanymalsDetails.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnAvailableAnipane(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/ViewAllanymalsDetails.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnViewWebsite(ActionEvent actionEvent) {
    }
}
