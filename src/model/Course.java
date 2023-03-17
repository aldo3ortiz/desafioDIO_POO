package model;

import domain.Content;

public class Course extends Content {

   private int workload;

    @Override
    public double calculate() {
        return STANDARD * workload;
    }

    //SETTERS

    public void setWorkload(int workload){
        this.workload = workload;
    }

    //GETTERS

   public int getWorkload(){
        return workload;
    }

    //ToString

    public String toString() {
        return "Course title...: " + getTitle() + "\n" +
                "Course desc....: " + getDescription() + "\n" +
                "Course workload: " + workload + " hours\n";
    }


}
