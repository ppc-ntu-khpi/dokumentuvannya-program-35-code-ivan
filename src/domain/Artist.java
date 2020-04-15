package domain;

/**
 * The class that represents Employee in the position of Artist.
 * For more information see {@link Employee}
 */
public class Artist extends Employee {

    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Method that returns information about employee and artist skills
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Method that returns artist skills
     * @return String
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method you can use to set skills
     * @param skills artist skills
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Method that returns artist skills list
     * @return String array
     */
    public String[] getSkillsList() {
        return skiils;
    }
}
