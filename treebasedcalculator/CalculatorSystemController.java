/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package treebasedcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CalculatorSystemController {
    private String infix = "";
    private String result = "";

    @FXML
    private Button btnExit;
    @FXML
    private Button btnClear;
    @FXML
    private TextField textField;
    @FXML
    private Button btnOpenParentheses;
    @FXML
    private Button btnCloseParentheses;
    @FXML
    private Button btnDivide;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button brnMultiply;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btnMinus;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btnPlus;
    @FXML
    private Button btn0;
    @FXML
    private Button btnPoint;
    @FXML
    private Button btnCalculate;
    @FXML
    private Button btnModulus;
    @FXML
    private TextField textField2;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnExit) {
            System.exit(0);
        } else if(event.getSource() == btnClear){
            infix = "";
            textField.clear();
            textField2.clear();
        }
        
    }
    
    public void updateTextField(){ textField.setText(infix);}
    
    public void addDigits(String digits){
        infix += digits;
        updateTextField();
    }

    @FXML
    private void btn0Clicked(ActionEvent event) {addDigits("0");}

    @FXML
    private void btnOpenClicked(ActionEvent event) {addDigits("(");}

    @FXML
    private void btnCloseClicked(ActionEvent event) {addDigits(")");}

    @FXML
    private void btnDivideClicked(ActionEvent event) {addDigits("/");}

    @FXML
    private void btn7Clicked(ActionEvent event) {addDigits("7");}

    @FXML
    private void btn8Clicked(ActionEvent event) {addDigits("8");}

    @FXML
    private void btn9Clicked(ActionEvent event) {addDigits("9");}

    @FXML
    private void btnMultiplyClicked(ActionEvent event) {addDigits("*");}

    @FXML
    private void btn4Clicked(ActionEvent event) {addDigits("4");}

    @FXML
    private void btn5Clicked(ActionEvent event) {addDigits("5");}

    @FXML
    private void btn6Clicked(ActionEvent event) {addDigits("6");}

    @FXML
    private void btnMinusClicked(ActionEvent event) {addDigits("-");}

    @FXML
    private void btn1Clicked(ActionEvent event) {addDigits("1");}

    @FXML
    private void btn2Clicked(ActionEvent event) {addDigits("2");}

    @FXML
    private void btn3Clicked(ActionEvent event) {addDigits("3");}

    @FXML
    private void btnPlusClicked(ActionEvent event) {addDigits("+");}

    @FXML
    private void btnPointClicked(ActionEvent event) {addDigits(".");}

    @FXML
    private void btnCalculateClicked(ActionEvent event) {
        textField2.setText(infix);
        result = Algorithm.calculate(infix);
        textField.setText(result);
        infix = result; //to continue calculation with result
    }

    @FXML
    private void btnModulusClicked(ActionEvent event) {addDigits("%");
    }

}
