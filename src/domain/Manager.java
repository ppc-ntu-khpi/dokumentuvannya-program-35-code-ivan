package domain;
/**
 * The class that represents Employee in the position of Manager.
 * For more information see {@link Employee}
 */
public class Manager extends Employee {

    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Method that returns information about manager as employee and his employees
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Method that returns employees
     * @return String with employees names
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method you can use to set employees array for manager
     * @param employees employees you want set for manager
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method that returns array of manager's employees
     * @return array of Employee class objects
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
