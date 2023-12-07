package com.example.messenger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Scene1Controller {
    @FXML
    private void scene2Clicked(MouseEvent event) {
        // Load the second scene
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Scene2.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            // Get the stage from the event source
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void scene3Clicked(MouseEvent event) {
        // Load the second scene
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Scene3.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            // Get the stage from the event source
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void scene5Clicked(MouseEvent event) {
        // Load the second scene
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Scene5.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            // Get the stage from the event source
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
