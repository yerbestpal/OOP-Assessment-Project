package models;


public class Product {
    // attributes
    private int productId;
    private String productName;
    private double price;
    private int stockLevel;
    
    
    @Override
    public String toString() {
        String display = productName;
        return display;
    }
    
    
    // getters
    public int getProductId() {
        return productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getStockLevel() {
        return stockLevel;
    }
    
    
    // setters
    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
    
    
    // default constructor
    public Product() {
        productId = 0;
        productName = "";
        price = 0.0;
        stockLevel = 0;
    }
    
    
        
    // overloaded constructor (3 parameters)
    public Product(String productName, double price, int stockLevel) {
        this.productId = 0 ;
        this.productName = productName;
        this.price = price;
        this.stockLevel = stockLevel;
    }
    
    
    // overloaded constructor (all parameters)
    public Product(int productId, String productName, double price, int stockLevel) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockLevel = stockLevel;
    }
}
