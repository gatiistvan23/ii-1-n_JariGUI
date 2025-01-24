package com.example;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField brandField;

    @FXML
    private TextField certField;

    @FXML
    private TextField climateField;

    @FXML
    private TextField fuelField;

    @FXML
    private TextField plateField;

    @FXML
    private TextField priceField;

    @FXML
    private TextField yearField;
    ArrayList<Car> carList = new ArrayList<>();
    int actualCar = 0;

    @FXML
    private void initialize() {
      
        System.out.println("műkszik");          
        Solution sol = new Solution();
        carList = sol.fileToList();

        for(Car car: carList) {
            System.out.println(car.getBrand());            
        }
        showCar(0);
    }

    private void showCar(int index) {        
            this.brandField.setText(carList.get(index).getBrand());
    }

    @FXML
    void onClickBackButton(ActionEvent event) {
        if(actualCar > carList.size()-1) {
            return;  
        }
        showCar(--actualCar);
    }
    

    @FXML
    void onClickNextButton(ActionEvent event) {
        if (actualCar > (carList.size()-2)) {
            return;
        }
        showCar(++actualCar);
    }
    

    @FXML
    void onClickSaveButton(ActionEvent event) {
        
        
    }

}
