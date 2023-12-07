package com.example.messenger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene3Controller {
    @FXML
    private void scene1Clicked(MouseEvent event) {
        // Load the second scene
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Scene1.fxml"));
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
