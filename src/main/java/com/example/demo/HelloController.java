package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class HelloController {
    @FXML
    private TextField TF1;
    @FXML
    private TextField TF2;
    @FXML
    protected void onHelloButtonClick() {
        TF1.setText("");
        TF2.setText("");
        l1.setText("");
    }
    @FXML
    private Label l1;
    @FXML
    protected void Two(){
        l1.setText(Double.toString(Double.parseDouble(TF1.getText())+Double.parseDouble(TF2.getText())));
    }
}