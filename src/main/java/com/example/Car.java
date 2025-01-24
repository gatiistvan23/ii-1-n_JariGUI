package com.example;

import java.time.LocalDate;

public class Car {
    private String plate;
    private String brand;
    private Integer year;
    private String fuel;
    private Double price;
    private Boolean climate;
    private LocalDate cert;       
    
    public Car() {}

    public Car(String plate, String brand, Integer year, String fuel, Double price, Boolean climate, LocalDate cert) {
        this.plate = plate;
        this.brand = brand;
        this.year = year;
        this.fuel = fuel;
        this.price = price;
        this.climate = climate;
        this.cert = cert;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) { 
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getClimate() {
        return climate;
    }

    public void setClimate(Boolean climate) {
        this.climate = climate;
    }

    public LocalDate getCert() {        
        return cert;
    }   

    public void setCert(LocalDate cert) {
        this.cert = cert;
    }

    
    


}

