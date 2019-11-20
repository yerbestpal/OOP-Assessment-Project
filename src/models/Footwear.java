package models;

/**
 *
 * @author M20086155
 */
public class Footwear extends Product {
    // private attributes
    private int size;

    
    
    // getters
    public int getSize() {
        return size;
    }

    
    
    // setters
    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    // overloaded constructor (4 parameters)
    public Footwear(String productName, double price, int stockLevel, int size) {
        super(productName, price, stockLevel);
        this.size = size;
    }
    
    // overloaded constructor (5 parameters)
    public Footwear(int productId, String productName, double price, int stockLevel, int size) {
        super(productId, productName, price, stockLevel);
        this.size = size;
    }
}
