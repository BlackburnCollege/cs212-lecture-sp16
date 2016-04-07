/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fx.dialog;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/**
 * This opens a normal window and opens a dialog box above it.
 * The dialog box does nothing. The goggles, they do nothing (Ranier Wolfcastle
 * in Radioactive Man)
 * @author joshua.gross
 */
public class DialogRunner extends Application {

    public void start(Stage stage) throws IOException {
        // create a root Parent object to hold the FXML-generated 
        // window
        Parent parent = FXMLLoader.load(getClass().getResource("SimpleScreen.fxml"));
        Scene parentScene = new Scene(parent);
        stage.setScene(parentScene);
        stage.show();
        
        
        Stage dialogStage = new Stage();
        GridPane root = FXMLLoader.load(getClass().getResource("Dialog.fxml"));
        Scene scene = new Scene(root);
        dialogStage.setScene(scene);
        dialogStage.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
 
    }
}
