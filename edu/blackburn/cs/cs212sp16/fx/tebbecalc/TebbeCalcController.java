/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.fx.tebbecalc;

import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author joshua.gross
 */
public class TebbeCalcController implements Initializable {

    @FXML
    private TextField output;
    
    private int count = 0;

    @FXML
    private void handleClick(ActionEvent event) {
        this.count++;
        this.output.setText(Integer.toString(this.count));
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
