package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * Developer class deals with developers
 */
public class Dev {

    /**
     * Attribute holds the name of a developer
     */
    private String name;

    /**
     * enrolledDev is a Set that holds the enrollment of a developer
     */
    private Set<Content> enrolledDev = new LinkedHashSet<>();

    /**
     * concludedDev is a Set that holds the conclusion active by a developer
     */
    private Set<Content> concludedDev = new LinkedHashSet<>();

    /////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Method to enroll the developer into a bootcamp
     * @param bootcamp
     */
    public void enrollBootcamp(Bootcamp bootcamp){
        this.enrolledDev.addAll(bootcamp.getContentsBootcamp());
        bootcamp.getEnrolledBootcamp().add(this);
    }

    /**
     * Method to deal with the developer's progress in a bootcamp
     */
    public void progress(){
        Optional<Content> content = this.enrolledDev.stream().findFirst();
        if(content.isPresent()){
            this.concludedDev.add(content.get());
            this.enrolledDev.remove(content.get());
        }else{
            System.err.println("You are not enrolled in any content!");
        }
    }

    /**
     * Method that calculates the expert score (scores * workload)
     * @return the calculation for EXPERT
     */
    public double calculate() {
        return this.concludedDev.stream().mapToDouble(Content::calculate).sum();
    }

    /////////////////////////////////////////////////////////////////////////////////////////SETTERS

    /**
     * Sets the name of a developer
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the enrollment of a developer
     * @param enrolledDev
     */
    public void setEnrolledDev(Set<Content> enrolledDev){
        this.enrolledDev = enrolledDev;
    }

    /**
     * Sets the conclusion of a developer
     * @param concludedDev
     */
    public void setConcludedDev(Set<Content> concludedDev){
        this.concludedDev = concludedDev;
    }

    /////////////////////////////////////////////////////////////////////////////////////////GETTERS

    /**
     * Gets the name of a developer
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the enrollment of a developer
     * @return enrolledDev
     */
    public Set<Content> getEnrolledDev(){
        return enrolledDev;
    }

    /**
     * Gets the conclusion of a developer
     * @return concludeDev
     */
    public Set<Content> getConcludedDev(){
        return concludedDev;
    }


    /////////////////////////////////////////////////////////////////////////////////////////toString

    /**
     * The toString method
     * @return toString for developer attributes
     */
    @Override
    public String toString() {
        return "Dev name.......: " + name + "\n" +
                "Enrolled.......: " + enrolledDev + "\n" +
                "Concluded......: " + concludedDev + "\n";
    }

    /////////////////////////////////////////////////////////////////////////////////////////

    /**
     * The equals method
     * @param o
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(enrolledDev, dev.enrolledDev) && Objects.equals(concludedDev, dev.concludedDev);
    }

    /**
     * The hashCode method
     * @return the Objects.hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledDev, concludedDev);
    }
}
