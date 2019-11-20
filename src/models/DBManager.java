/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author M20086155
 */
public class DBManager {
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    
    // windows connection string
//    private final String connectionString = "jdbc:ucanaccess://H:\\HND\\OOP\\M20086155_shop\\data\\ShopDB.accdb";
    
    // linux connection string
    private final String connectionString = "jdbc:ucanaccess://data/ShopDB.accdb";
    
    
    public HashMap<String, Staff> loadStaff() {
        HashMap<String, Staff> staffHash = new HashMap();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");
            
            while (rs.next()) {
                String userName = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String position = rs.getString("Position");
                double salary = rs.getDouble("Salary");
                
                Staff staff = new Staff(
                        userName, password, firstName,
                        lastName, position, salary
                );
                staffHash.put(userName, staff);
            }
            conn.close();
        } 
        catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        } 
        finally {
            return staffHash;
        }
    }
    
    
    public Staff staffLogin(String username, String password) {
        HashMap<String, Staff> staffHash = loadStaff();
        
        if (staffHash.containsKey(username)) {
            Staff foundStaff = staffHash.get(username);
            if (foundStaff.getPassword().equals(password)) {
                return foundStaff;
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
    }
    
    
    public boolean registerCustomer(Customer customer) {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate(
                    "INSERT INTO Customers (Username, Password, FirstName,"
                            + "LastName, AddressLine1, AddressLine2, Town,"
                            + "Postcode) "
                    + "VALUES ('" + customer.getUsername() + "', "
                    + "'" + customer.getPassword() + "', "
                    + "'" + customer.getFirstName() + "', "
                    + "'" + customer.getLastName() + "', "
                    + "'" + customer.getAddressLine1() + "', "
                    + "'" + customer.getAddressLine2() + "', "
                    + "'" + customer.getTown() + "', "
                    + "'" + customer.getPostcode() + "')"
            );
            
            conn.close();
            return true;
            
        } catch ( Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            return false;
        }
    }
    
    
    public HashMap<String, Customer> loadCustomers() {
        HashMap<String, Customer> customerHash = new HashMap();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");
            
            while (rs.next()) {
                String userName = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String addressLine1 = rs.getString("AddressLine1");
                String addressLine2 = rs.getString("AddressLine2");
                String town = rs.getString("Town");
                String postCode = rs.getString("Postcode");
                
                Customer cust = new Customer(userName, password, firstName, 
                        lastName, addressLine1, addressLine2, town, postCode);
                
                customerHash.put(userName, cust);
            }
            conn.close();
        }
        catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        finally {
            return customerHash;
        }
    }
    
    
    public HashMap<Integer, Product> loadProducts() {
        HashMap<Integer, Product> productHash = new HashMap();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Products");

            while (rs.next()) {
                int productId = rs.getInt("ProductId");
                String productName = rs.getString("ProductName");
                double price = rs.getDouble("Price");
                int stockLevel = rs.getInt("StockLevel");
                String measurement = rs.getString("Measurement");
                int size = rs.getInt("Size");
                
                // put footwear
                if (measurement == null || measurement.equals("")) {
                    Footwear footwear = new Footwear(
                            productId, productName, 
                            price, stockLevel, size
                    );
                    productHash.put(productId, footwear);
                } // put clothing
                else {
                    Clothing clothing = new Clothing(
                            productId, productName, price, 
                            stockLevel, measurement
                    );
                    productHash.put(productId, clothing);
                }
            }
            conn.close();
        }
        catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        finally {
            return productHash;
        }
    }
    
    
    public Customer customerLogin(String username, String password) {
        HashMap<String, Customer> customerHash = loadCustomers();
        
        if (customerHash.containsKey(username)) {
            Customer foundCustomers = customerHash.get(username);
            if (foundCustomers.getPassword().equals(password)) {
                return foundCustomers;
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
    }
    
    
    public void addProduct(Product product) {
        // set default values for Measurement and Size
        String measurement = "";
        String size = "0";
        
        if (product.getClass().getName().equals("models.Clothing")) {
            Clothing clothing = (Clothing) product;
            measurement = String.valueOf(clothing.getMeasurement());
        }
        else {
            Footwear footwear = (Footwear) product;
            size = String.valueOf(footwear.getSize());
        }
        
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate(
                    "INSERT INTO Products (ProductName, Price, StockLevel, Measurement, Size) "
                    + "VALUES   ('" + product.getProductName() + "', "
                    + "'" + product.getPrice() + "', "
                    + "'" + product.getStockLevel() + "', "
                    + "'" + measurement + "', "
                    + "'" + size.toString() + "')"
            );
            conn.close();
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
