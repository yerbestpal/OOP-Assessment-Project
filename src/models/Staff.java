package models;

/**
 *
 * @author M20086155
 */
public class Staff extends User {
    // private attributes
    private String position;
    private double salary;
    
    
    public String displayGreeting() {
        String greeting = "<html>Hello " + getFirstName() + " " + getLastName() 
                + "<br>" + "You are logged in as Staff</html>";
        return greeting;
    }

    
    
    // getters
    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    
    
    // setters
    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    // default constructor
    public Staff() {
        super();
        this.position = "";
        this.salary = 0;
    }
    
    // overloaded constructor (6 parameters)
    public Staff(String username, String password, String firstName, 
            String lastName, String position, double salary) {
        super(username, password, firstName, lastName);
        this.position = "";
        this.salary = 0;
    }
}
