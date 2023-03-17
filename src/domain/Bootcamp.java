package domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Bootcamp deals with the bootcamp programs
 * (program's name, description, starting and final date)
 */
public class Bootcamp {

    /**
     * Attribute name holds the name of a program
     */
    private String name;

    /**
     * Attribute description holds the details of a program
     */
    private String description;

    /**
     * Attribute startDate holds the starting date of a program.
     * It grabs the current date (LocalDate.now) when a new object is instantiated
     */
    private final LocalDate startDate = LocalDate.now();

    /**
     * Attribute finalDate holds the final date of a program.
     * It is setup in days when a new object is instantiated
     */
    private final LocalDate finalDate = startDate.plusDays(45);

    /**
     * enrolledBootcamp is a Set that holds the enrolled bootcamp a dev is taking
     */
    private Set<Dev> enrolledBootcamp = new HashSet<>();

    /**
     * contentsBootcamp is a Set that holds the bootcamp's contents
     */
    private Set<Content> contentsBootcamp = new LinkedHashSet<>();

    /////////////////////////////////////////////////////////////////////////////////////////SETTERS

    /**
     * Sets a name for a bootcamp
     * @param name for a bootcamp
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets a description for a bootcamp
     * @param description for a bootcamp
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the bootcamps a dev is enrolled in
     * @param enrolledBootcamp a dev is enrolled in
     */
    public void setEnrolledBootcamp(Set<Dev> enrolledBootcamp) {
        this.enrolledBootcamp = enrolledBootcamp;
    }

    /**
     * Sets the contents of a bootcamp
     * @param contentsBootcamp for the contents of a bootcamp
     */
    public void setContentsBootcamp(Set<Content> contentsBootcamp) {
        this.contentsBootcamp = contentsBootcamp;
    }

    /////////////////////////////////////////////////////////////////////////////////////////GETTERS

    /**
     * Gets a bootcamp's name
     * @return name of a bootcamp
     */
    public String getName() {
        return name;
    }

    /**
     * Gets a description of a bootcamp
     * @return description of a bootcamp
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the bootcamps a dev is enrolled in
     * @return enrolldBootcamp a dev is enrolled in
     */
    public Set<Dev> getEnrolledBootcamp() {
        return enrolledBootcamp;
    }

    /**
     * Gets the contents from a bootcamp
     * @return contentsBootcamp
     */
    public Set<Content> getContentsBootcamp() {
        return contentsBootcamp;
    }

    /////////////////////////////////////////////////////////////////////////////////////////GETTERS - DATES

    /**
     * Gets the initial date for a bootcamp
     * @return startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Gets the final date for a bootcamp
     * @return finalDate
     */
    public LocalDate getFinalDate() {
        return finalDate;
    }


    /////////////////////////////////////////////////////////////////////////////////////////toString

    /**
     * The toString method
     * @return toString for bootcamp attributes
     */
    @Override
    public String toString() {
        return "Bootcamp name..: " + name + "\n" +
                "Description....: " + description + "\n" +
                "StartDate......: " + startDate + "\n" +
                "FinalDate......: " + finalDate + "\n" +
                "Enrolled.......: " + enrolledBootcamp + "\n" +
                "Contents.......: " + contentsBootcamp + "\n";
    }

    /////////////////////////////////////////////////////////////////////////////////////////

    /**
     * The equals method
     * @param o Object
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(enrolledBootcamp, bootcamp.enrolledBootcamp) && Objects.equals(contentsBootcamp, bootcamp.contentsBootcamp);
    }

    /**
     * The hashCode method
     * @return the Objects.hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, finalDate, enrolledBootcamp, contentsBootcamp);
    }
}
