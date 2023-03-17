package domain;

public abstract class Content {

    protected static final double STANDARD = 10;

    private String title;
    private String description;

    public abstract double calculate();

    //SETTERS

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }


    //GETTERS

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }


    //toString


    @Override
    public String toString() {
        return "Title..........: " + title + "\n" +
                "Description....: " + description + "\n";

    }
}
