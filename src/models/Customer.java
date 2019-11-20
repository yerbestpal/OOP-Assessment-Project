package models;



public class Customer extends User {
    // private attributes
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String postcode;
    private boolean isRegistered;
    
    
    public String displayGreeting() {
        String greeting = "<html>Welcome " + getFirstName() + " " + getLastName() 
                + "<br>" + "Enjoy Shopping!</html>";
        return greeting;
    }
    
    
    // getters
    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getTown() {
        return town;
    }

    public String getPostcode() {
        return postcode;
    }

    public boolean getIsRegistered() {
        return isRegistered;
    }
    
    
    
    // setters
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setIsRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }
    
    
    
    // default constructor
    public Customer() {
        super();
        this.addressLine1 = "";
        this.addressLine2 = "";
        this.town = "";
        this.postcode = "";
        this.isRegistered = true;
    }
    
    // overloaded constructor (8 parameters)
    public Customer(String username, String password, String firstName, String lastName, 
            String addressLine1, String addressLine2, String town, String postcode) {
        super(username, password, firstName, lastName);
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.town = town;
        this.postcode = postcode;
    }
}
