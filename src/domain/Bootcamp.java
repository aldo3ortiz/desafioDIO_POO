package domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finalDate = startDate.plusDays(45);

    private Set<Dev> enrolledBootcamp = new HashSet<>();
    private Set<Content> contentsBootcamp = new LinkedHashSet<>();

    //SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEnrolledBootcamp(Set<Dev> enrolledBootcamp) {
        this.enrolledBootcamp = enrolledBootcamp;
    }

    public void setContentsBootcamp(Set<Content> contentsBootcamp) {
        this.contentsBootcamp = contentsBootcamp;
    }

    //GETTERS

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<Dev> getEnrolledBootcamp() {
        return enrolledBootcamp;
    }

    public Set<Content> getContentsBootcamp() {
        return contentsBootcamp;
    }

    // GETTERS - DATES

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }


    //toString


    @Override
    public String toString() {
        return "Bootcamp name..: " + name + "\n" +
                "Description....: " + description + "\n" +
                "StartDate......: " + startDate + "\n" +
                "FinalDate......: " + finalDate + "\n" +
                "Enrolled.......: " + enrolledBootcamp + "\n" +
                "Contents.......: " + contentsBootcamp + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(enrolledBootcamp, bootcamp.enrolledBootcamp) && Objects.equals(contentsBootcamp, bootcamp.contentsBootcamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, finalDate, enrolledBootcamp, contentsBootcamp);
    }
}
