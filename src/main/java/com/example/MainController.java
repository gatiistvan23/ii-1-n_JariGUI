package com.example;

import java.time.LocalDate;
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
            Car car = carList.get(index);      
            this.brandField.setText(carList.get(index).getBrand());
            this.certField.setText(car.getCert().toString());
            this.climateField.setText(car.getClimate().toString());
            this.fuelField.setText(car.getFuel());
            this.plateField.setText(car.getPlate());
            this.priceField.setText(car.getPrice().toString());
            this.yearField.setText(car.getYear().toString());
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
        System.out.println("mentés...");
        DataSource ds = new DataSource();
        Car car = new Car(
            this.plateField.getText(),
            this.brandField.getText(),          
            Integer.parseInt(this.yearField.getText()),
            this.fuelField.getText(),            
            Double.parseDouble(this.priceField.getText()),
            Boolean.parseBoolean(this.climateField.getText()), 
            LocalDate.parse(this.certField.getText())); 
        ds.addCar(car);   
    }

}
