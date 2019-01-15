//PT -- missing javadoc. -2.

public class Police extends Person implements Employee {
    public enum Role {Patrol, Sargent, Captain, Chief}; 
    private Role role;
    private int moneyAmount = 0;
    private String employeeID;
    
    // Blank Police constructof
    public Police() {
        super(" ", 0, 0);
    }

    // Police constructor that sets their name, age, and phone number
    public Police(String name, int age, long phoneNumber) {
        super(name, age, phoneNumber);
    }
    
    // Sets the role of the police 
    public void setRole(Role _role) {
        role = _role;
    }

    // Returns the role of the police
    public Role getRole() {
        return role; 
    }

    // Pays the police
    public void payEmployee() {
        moneyAmount = moneyAmount + 100;
    }

    // Returns the employee ID for the police
    public String getEmployeeID() {
        return employeeID;
    }

    // Sets the employee ID for the police
    public void setEmployeeID(String _employeeID) {
        employeeID = _employeeID;
    }

    // Returns how much money the police officer has 
    public int bankAmount() {
        return moneyAmount;
    }

    // Used to return the name of the police
    public String toString() {
        return name; 
    }
}
