/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author M20086155
 */
public class Order {
    // private attributes
    private int orderId;
    private Date orderDate;
    private double orderTotal;
    private String status;
    // HashMap<datatype_of_key, datatype of values> name;
    private HashMap<Integer, OrderLine> orderLine;
    
    
    // getters
    public int getOrderId() {
        return this.orderId;
    }
    
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public double getOrderTotal() {
        return this.orderTotal;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public HashMap<Integer, OrderLine> getOrderLine() {
        return this.orderLine;
    }
    
    
    // setters
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public void setOrderLine(HashMap<Integer, OrderLine> orderLine) {
        this.orderLine = orderLine;
    }
    
    
    
    // 0 parameter constructor
    public Order() {
        this.orderId = 0;
        this.orderDate = new Date();
        this.orderTotal = 0;
        this.status = "";
        this.orderLine = new HashMap();
    }
    
    // 4 parameter constructor
    public Order(int orderId, Date orderDate, double orderTotal, String status) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
        this.status = status;
        this.orderLine = new HashMap();
    }
}
