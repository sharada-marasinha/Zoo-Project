package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.scene.layout.AnchorPane;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ClassificationFormDashbord {
   

    public AnchorPane LodeFormContent;
    public Button btnFood;
    public Button btnAboutClassification;
    public Button btnKingdom;
    public Button btnHabitat;
    public Button btnEndangered;
    public AnchorPane cloneAbout;


    public void btnFood(ActionEvent actionEvent) throws IOException {
        btnFood.setStyle("-fx-background-color: black;");
        btnAboutClassification.setBackground(null);
        btnKingdom.setBackground(null);
        btnHabitat.setBackground(null);
        btnEndangered.setBackground(null);

        System.out.println("btn clikd");
        URL resource = this.getClass().getResource("../view/FoodForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.LodeFormContent.getChildren().clear();
        this.LodeFormContent.getChildren().add(load);
    }

    public void btnHabitat(ActionEvent actionEvent) throws IOException {
        btnHabitat.setStyle("-fx-background-color: black;");
        btnAboutClassification.setBackground(null);
        btnKingdom.setBackground(null);
        btnFood.setBackground(null);
        btnEndangered.setBackground(null);
        System.out.println("btn clikd");
        URL resource = this.getClass().getResource("../view/HabitatForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.LodeFormContent.getChildren().clear();
        this.LodeFormContent.getChildren().add(load);
    }

    public void btnEndangered(ActionEvent actionEvent) throws IOException {
        btnEndangered.setStyle("-fx-background-color: black;");
        btnAboutClassification.setBackground(null);
        btnKingdom.setBackground(null);
        btnFood.setBackground(null);
        btnHabitat.setBackground(null);
        System.out.println("btn clikd");
        URL resource = this.getClass().getResource("../view/EndangeredForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.LodeFormContent.getChildren().clear();
        this.LodeFormContent.getChildren().add(load);
    }

    public void btnKingdom(ActionEvent actionEvent) throws IOException {
        btnKingdom.setStyle("-fx-background-color: black;");
        btnAboutClassification.setBackground(null);
        btnEndangered.setBackground(null);
        btnFood.setBackground(null);
        btnHabitat.setBackground(null);
        System.out.println("btn clikd");
        URL resource = this.getClass().getResource("../view/KingdomForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.LodeFormContent.getChildren().clear();
        this.LodeFormContent.getChildren().add(load);
    }

    public void hiperFood(ActionEvent actionEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://sites.google.com/site/featuresofanimals/classifying-animals-according-to-the-food-they-eat"));
    }

    public void hiperHabitat(ActionEvent actionEvent) {
    }

    public void hiperEndangered(ActionEvent actionEvent) {
    }

    public void hiperKingdom(ActionEvent actionEvent) {
    }

    public void btnAboutClassification(ActionEvent actionEvent) throws IOException {
        btnAboutClassification.setStyle("-fx-background-color: black;");
        btnKingdom.setBackground(null);
        btnEndangered.setBackground(null);
        btnFood.setBackground(null);
        btnHabitat.setBackground(null);
        URL resource = this.getClass().getResource("../view/cloneAboutClassificationForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.LodeFormContent.getChildren().clear();
        this.LodeFormContent.getChildren().add(load);
    }
}
