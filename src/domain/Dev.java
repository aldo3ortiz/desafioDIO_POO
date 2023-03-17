package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> enrolledDev = new LinkedHashSet<>();
    private Set<Content> concludedDev = new LinkedHashSet<>();

    public void enrollBootcamp(Bootcamp bootcamp){
        this.enrolledDev.addAll(bootcamp.getContentsBootcamp());
        bootcamp.getEnrolledBootcamp().add(this);
    }

    public void progress(){
        Optional<Content> content = this.enrolledDev.stream().findFirst();
        if(content.isPresent()){
            this.concludedDev.add(content.get());
            this.enrolledDev.remove(content.get());
        }else{
            System.err.println("You are not enrolled in any content!");
        }
    }

    public double calculate() {
        return this.concludedDev.stream().mapToDouble(Content::calculate).sum();
    }

    //SETTERS

    public void setName(String name){
        this.name = name;
    }

    public void setEnrolledDev(Set<Content> enrolledDev){
        this.enrolledDev = enrolledDev;
    }

    public void setConcludedDev(Set<Content> concludedDev){
        this.concludedDev = concludedDev;
    }

    //GETTERS

    public String getName(){
        return name;
    }

    public Set<Content> getEnrolledDev(){
        return enrolledDev;
    }

    public Set<Content> getConcludedDev(){
        return concludedDev;
    }


    //toString


    @Override
    public String toString() {
        return "Dev name.......: " + name + "\n" +
                "Enrolled.......: " + enrolledDev + "\n" +
                "Concluded......: " + concludedDev + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(enrolledDev, dev.enrolledDev) && Objects.equals(concludedDev, dev.concludedDev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledDev, concludedDev);
    }
}
