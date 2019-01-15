//PT -- missing javadoc. -2

public interface Employee {

    // Used for employees to get paid
    public void payEmployee();

    // Used to get the employees ID
    public String getEmployeeID();

    // Used to set the employees ID
    public void setEmployeeID(String _employeeID);

    // Used to find out how much money the employee has
    public int bankAmount();
}
