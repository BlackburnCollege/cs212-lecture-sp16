/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fx.minesweeper;

import java.io.IOException;
import java.util.Random;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author joshua.gross
 */
public class MineSweep extends Application {

    public void start(Stage primaryStage) throws IOException {

        TextField score = new TextField();
        VBox box = new VBox();
        box.getChildren().add(score);
        GridPane mineField = new GridPane();
        box.getChildren().add(mineField);
        int size = 5;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                MineButton mb = new MineButton();
                MinePressHandler press = new MinePressHandler(mb);
                mb.setOnAction(press);
                mineField.add(mb, col, row);
            }
        }

        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        this.openDialog();

    }

    private void openDialog() throws IOException {
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

class MineButton extends Button {

    private static final Random random = new Random();
    private boolean mine;

    public MineButton() {
        super();
        this.mine = random.nextBoolean();
        this.setText(" ");
    }

    public void check() {
        if (this.mine) {
            this.setText("*");
        } else {
            this.setText("0");
        }
    }

}

class MinePressHandler implements EventHandler {

    private MineButton source;

    public MinePressHandler(MineButton source) {
        this.source = source;
    }

    public void handle(Event event) {
        this.source.check();
    }

}
