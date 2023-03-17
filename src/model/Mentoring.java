package model;

import domain.Content;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    @Override
    public double calculate() {
        return STANDARD + 20;
    }

    //SETTERS

    public void setDate(LocalDate date){
        this.date = date;
    }

    //GETTERS

    public LocalDate getDate(){
        return date;
    }

    //ToString

    public String toString(){
        return "Mentoring title: " + getTitle() + "\n" +
                "Description....: " + getDescription() + "\n" +
                "Date...........: " + date + "\n";
    }

}
