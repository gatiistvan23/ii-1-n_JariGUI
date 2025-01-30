package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Mariadb {
    public Connection connect(){
        try {
            return tryConnect();
        } catch (SQLException e) {
           System.err.println("Hiba! A kapcsolódás sikertelen!");
           System.err.println(e.getMessage());  
           return null;         
        }
        
                
    }
    
    public Connection tryConnect() throws SQLException{
        String user = "root";
        String pass = "";
        String url = "jdbc:mariadb://localhost:3306/jarigui";
        return DriverManager.getConnection(url, user, pass);
    }
}
