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
public class OrderLine {
    // private attributes
    private int orderLineId;
    private Product product;  // association
    private int quantity;
    private double lineTotal;
    
    
    // getters
    public int getOrderLineId() {
        return this.orderLineId;
    }
    
    public Product getProduct() {
        return this.product;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    
    // setters
    public void setOrderLineId(int orderLineId) {
        this.orderLineId = orderLineId;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }
    
    // 3 parameter constructor
    public OrderLine(int orderLineId, Product product, int quantity) {
        this.orderLineId = orderLineId;
        this.product = product;
        this.quantity = quantity;
        this.lineTotal = product.getPrice() * quantity;
    }
}
