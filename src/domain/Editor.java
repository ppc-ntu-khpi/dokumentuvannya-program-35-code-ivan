package domain;
/**
 * The class that represents Editor.
 * For more information see {@link Artist}
 */
public class Editor extends Artist {

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Method that returns information about employee editor
     * @return String
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Method you can use to check is editor prefer electronic editing
     * @return boolean value
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Method you can use to set editor preferences
     * @param electronic true if editor prefer electronic editing
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
