package com.example.calcolatrice;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    private String

    @FXML
    private Button B0;

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button B4;

    @FXML
    private Button B5;

    @FXML
    private Button B6;

    @FXML
    private Button B7;

    @FXML
    private Button B8;

    @FXML
    private Button B9;

    @FXML
    private Button cancel;

    @FXML
    private Button division;

    @FXML
    private Button minus;

    @FXML
    private Button mul;

    @FXML
    private Button plus;

    @FXML
    private Button result;

    @FXML
    private TextField textField;

    @FXML
    void button0Clicked(ActionEvent event) {
        if(!currentNumber.equals("")) {
            addNumber("0");
        }
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void button2Clicked(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void button3Clicked(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void button4Clicked(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void button5Clicked(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void button6Clicked(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void button7Clicked(ActionEvent event) {
        addNumber("7");

    }

    @FXML
    void button8Clicked(ActionEvent event) {
        addNumber("8");

    }

    @FXML
    void button9Clicked(ActionEvent event) {
        addNumber("9");

    }

    @FXML
    void cancella(ActionEvent event) {

    }

    @FXML
    void divisione(ActionEvent event) {

    }

    @FXML
    void moltiplicazione(ActionEvent event) {

    }

    @FXML
    void risultato(ActionEvent event) {

    }

    @FXML
    void sottrazione(ActionEvent event) {

    }


    public void updateTextField(){textField.setText(currentNumber);}

    public void addNumber(String number){
        currentNumber += number;
        updateTextField();
    }

    public void calculationSetup(String calculationType){
        this.caòc
    }

}