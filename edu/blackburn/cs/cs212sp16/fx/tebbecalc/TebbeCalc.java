/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fx.tebbecalc;

import javafx.application.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.io.*;

/**
 *
 * @author joshua.gross
 */
public class TebbeCalc extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent root = FXMLLoader.load(this.getClass().getResource("TebbeCalc.fxml"));        
        Scene scene = new Scene(root, 300, 250);        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
