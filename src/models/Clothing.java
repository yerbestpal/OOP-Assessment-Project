/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author M20086155
 */
public class Clothing extends Product {
    // private attributes
    private String measurement;

    
    
    // getters
    public String getMeasurement() {
        return measurement;
    }

    
    
    // setters
    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
    
    
    // overloaded constructor (4 parameters)
    public Clothing(String productName, double price, int stockLevel, String measurement) {
        super(productName, price, stockLevel);
        this.measurement = measurement;
    }
    
    // overloaded constructor(5 parameters)
    public Clothing(int productId, String productName, double price, int stockLevel, String measurement) {
        super(productId, productName, price, stockLevel);
        this.measurement = measurement;
    }
}
