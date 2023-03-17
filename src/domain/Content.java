package domain;

/**
 * Abstract class that deals with the contents of a bootcamp, course, and mentoring.
 */
public abstract class Content {

    /**
     * Constante EXPERT holds the scores to be calculate when the dev finish a program
     */
    protected static final double EXPERT = 10;

    /**
     * Attribute holds the title of a content
     */
    private String title;

    /**
     * Attribute holds the description of a content
     */
    private String description;

    /////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Abstract method to calculate the expert score (scores * workload)
     * @return the value of the calculation
     */
    public abstract double calculate();

    /////////////////////////////////////////////////////////////////////////////////////////SETTERS

    /**
     * Sets the title of a content
     * @param title
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Sets the description of a content
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }

    /////////////////////////////////////////////////////////////////////////////////////////GETTERS

    /**
     * Gets the title of a content
     * @return title
     */
    public String getTitle(){
        return title;
    }

    /**
     * Gets the description of a content
     * @return description
     */
    public String getDescription(){
        return description;
    }

    /////////////////////////////////////////////////////////////////////////////////////////toString

    /**
     * The toString method
     * @return toString for bootcamp attributes
     */
    @Override
    public String toString() {
        return "Title..........: " + title + "\n" +
                "Description....: " + description + "\n";

    }
}
