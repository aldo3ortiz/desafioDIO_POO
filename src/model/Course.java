package model;

import domain.Content;

/**
 * Course class deals with courses
 */
public class Course extends Content {

    /**
     * Attribute that holds the workload of a course
     */
    private int workload;

    /////////////////////////////////////////////////////////////////////////////////////////

    /**
     * The method to calculate EXPERT * workload
     * @return the calculation
     */
    @Override
    public double calculate() {
        return EXPERT * workload;
    }

    /////////////////////////////////////////////////////////////////////////////////////////SETTERS

    /**
     * Sets the workload of a course
     * @param workload
     */
    public void setWorkload(int workload){
        this.workload = workload;
    }

    /////////////////////////////////////////////////////////////////////////////////////////GETTERS

    /**
     * Gets the workload of a course
     * @return workload
     */
   public int getWorkload(){
        return workload;
    }

    /////////////////////////////////////////////////////////////////////////////////////////ToString

    /**
     * The toString method
     * @return toString for course attributes
     */
    public String toString() {
        return "\nCourse title...: " + getTitle() + "\n" +
                "Course desc....: " + getDescription() + "\n" +
                "Course workload: " + workload + " hours\n";
    }

}
