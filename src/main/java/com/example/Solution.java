package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    ArrayList<Car> carList = new ArrayList<>();   

    public ArrayList<Car> fileToList() {
        try {
            tryFileToList();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
            
        }
                return carList;
    }
    public ArrayList<Car> tryFileToList() throws FileNotFoundException {   
        
        File file = new File("jaribt.txt");
        Scanner sc = new Scanner(file);
        //sc.nextLine();
        while(sc.hasNext()) {
            String line = sc.nextLine();

            String[] lineArray = line.split(":");
            Car car = new Car();           
            car.setPlate(lineArray[0]);
            car.setBrand(lineArray[1]);
            car.setYear(Integer.parseUnsignedInt(lineArray[2]));
            car.setFuel(lineArray[3]);
            car.setPrice(Double.parseDouble(lineArray[4]));
            boolean climate = true;
            if (lineArray[5].equals("0")) {
                climate = false;
            }
            car.setClimate(climate);
            car.setCert(LocalDate.parse(lineArray[6]));
            carList.add(car);         
            
        }
        sc.close();
        return carList;
        
    }
   
}
