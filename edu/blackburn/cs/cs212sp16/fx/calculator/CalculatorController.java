/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fx.calculator;

import java.net.*;
import java.util.*;
import javafx.fxml.*;
import java.io.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.Pos;

/**
 * FXML Controller class
 *
 * @author joshua.gross
 */
public class CalculatorController implements Initializable {

    private StringBuffer bufferString = null;
    private double bufferNumber = 0;
    
    private double cachedNumber = 0;
    
    private boolean first = true;
    private boolean hasMantissa = false;
    private Function nextFunction = null;

    @FXML
    private Button zeroButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button nineButton;

    @FXML
    private TextField output;

    @FXML
    private void handleNumberButton(ActionEvent event) {
        if (this.first) {
            this.setup();
        }
        if(this.bufferString == null) {
            this.bufferString = new StringBuffer();
        }
        Button pressed = (Button) event.getSource();
        int add = Integer.parseInt(pressed.getText());
        this.bufferString.append(add);
        this.bufferNumber = Double.parseDouble(this.bufferString.toString());
        this.output.setText(this.bufferString.toString());
    }

    @FXML
    private void handleDecimalPoint(ActionEvent event) {
        if (this.first) {
            this.setup();
        }
        if (this.bufferString == null) {
            this.bufferString = new StringBuffer("0");
        }
        if (this.hasMantissa == false) {
            this.bufferString.append(".");
            this.output.setText(this.bufferString.toString());
            this.hasMantissa = true;        
        }
    }
    
    @FXML
    private void handleFunctionButton(ActionEvent event) {
        if (this.first) {
            this.setup();
        }
                
        Button pressed = (Button) event.getSource();
        switch (pressed.getText()) {
            case "+": this.nextFunction = Function.ADD; break;
            case "-": this.nextFunction = Function.SUBTRACT; break;
            case "*": this.nextFunction = Function.MULTIPLY; break;
            case "/": this.nextFunction = Function.DIVIDE; break;
        }
        this.cachedNumber = this.bufferNumber;
        this.bufferString = null;
    }

    private void setup() {
        this.output.setAlignment(Pos.BASELINE_RIGHT);
        this.output.setEditable(false);
        this.output.setText("0");
        this.first = false;
    }

    
    @FXML
    private void handleSolve(ActionEvent event) {
        if(this.bufferString != null && this.nextFunction != null) {
            switch(this.nextFunction) {
                case ADD:
                    this.cachedNumber = this.cachedNumber + this.bufferNumber;
                    break;
                case SUBTRACT:
                    this.cachedNumber = this.cachedNumber - this.bufferNumber;
                    break;
                case MULTIPLY:
                    this.cachedNumber = this.cachedNumber * this.bufferNumber;
                    break;
                case DIVIDE:
                    this.cachedNumber = this.cachedNumber / this.bufferNumber;
                    break;
            }
            
            if (this.cachedNumber % 1.0 == 0) {
                this.output.setText(Long.toString((long)this.cachedNumber));                
            } else {
                this.output.setText(Double.toString(this.cachedNumber));
            }
            
            this.bufferString = null;
            this.nextFunction = null;
        }
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}

enum Function {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
    
}