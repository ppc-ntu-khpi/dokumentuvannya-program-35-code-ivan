package domain;

/**
 * The class that represents Employee
 */
public class Employee {

    /**
     * Method that returns information about employee
     * @return string
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Method you can use to set job title
     * @param job job you want set for employee
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Method that returns job title
     * @return String
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Method that returns employee Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Method you can use to set employee level
     * @param level employee level
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Method that returns employee level
     * @return int value
     */
    public int getLevel() {
        return level;
    }

    /**
     * Method that returns employee dept
     * @return String
     */
    public String getDept() {
        return dept;
    }

    /**
     *  Method you con use to set employee dept
     * @param dept dept where employee works
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Method you con use to set employee name
     * @param name employee name
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
