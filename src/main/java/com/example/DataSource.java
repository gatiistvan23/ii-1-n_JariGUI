package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSource {
    public void addCar(Car car) {
        try {
            tryAddCar(car);
        } catch (SQLException e) {
            System.err.println("Hiba! A hozzáadás sikertelen!");
            System.err.println(e.getMessage());
        }
    }
    
    public void tryAddCar(Car car) throws SQLException {
         Mariadb db = new Mariadb(); 
         Connection conn = db.connect(); 
         String sql = "insert into cars "+ 
         "(plate, brand, carYear, fuel, price, climate, carCert)" + 
         "values (?, ?, ?, ?, ?, ?, ?)";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, car.getPlate());
         ps.setString(2, car.getBrand());
         ps.setInt(3, car.getYear());
         ps.setString(4, car.getFuel());
         ps.setDouble(5, car.getPrice());
         ps.setBoolean(6, car.getClimate());
         ps.setDate(7, Date.valueOf(car.getCert()));
         ps.execute();
    }
}
