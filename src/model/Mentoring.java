package model;

import domain.Content;
import java.time.LocalDate;

/**
 * Mentoring class deals with mentoring programs
 */
public class Mentoring extends Content {

    /**
     * Attribute that hold the date
     */
    private LocalDate date;

    /////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Method to deal with the calculation of EXPERT + 20;
     * @return calculation
     */
    @Override
    public double calculate() {
        return EXPERT + 20;
    }

    /////////////////////////////////////////////////////////////////////////////////////////SETTERS

    /**
     * Sets the date of a mentoring
     * @param date
     */
    public void setDate(LocalDate date){
        this.date = date;
    }

    /////////////////////////////////////////////////////////////////////////////////////////GETTERS

    /**
     * Gets the date of a mentoring
     * @return date
     */
    public LocalDate getDate(){
        return date;
    }

    /////////////////////////////////////////////////////////////////////////////////////////ToString

    /**
     * The toString method
     * @return toString for mentoring attributes
     */
    public String toString(){
        return "\nMentoring title: " + getTitle() + "\n" +
                "Description....: " + getDescription() + "\n" +
                "Date...........: " + date + "\n";
    }

}
