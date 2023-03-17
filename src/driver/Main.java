package driver;

import domain.Bootcamp;
import domain.Dev;
import model.Course;
import model.Mentoring;
import java.time.LocalDate;

/**
 * DesafioDIO_POO Main class
 * Andre Ortiz - March 2023
 */
public class Main {

    /**
     * DesafioDIO_POO main method
     * @param args
     */
    public static void main(String[] args) {

        // course1 instance - new object Course
        Course course1 = new Course();
        course1.setTitle("Java1");
        course1.setDescription("Java Beginner 2023");
        course1.setWorkload(100);
        // System.out.println(course1); // it calls ToString from Course Class

        // course2 instance - new object Course
        Course course2 = new Course();
        course2.setTitle("Java2");
        course2.setDescription("Java Intermediate  2023");
        course2.setWorkload(100);
        // System.out.println(course2); // it calls ToString from Course Class

        // mentoring instance - new object Mentoring
        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java mentoring");
        mentoring.setDescription("Mentoring for Java Beginner 2023");
        mentoring.setDate(LocalDate.now()); // it sets the current date
        // System.out.println(mentoring); // it calls toString from Mentoring Class

        // bootcamp instance - new object Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description for Bootcamp Java Developer");
        bootcamp.getContentsBootcamp().add(course1);
        bootcamp.getContentsBootcamp().add(course2);
        bootcamp.getContentsBootcamp().add(mentoring);

        System.out.println("=================================================================");

        // dev instance = new object Dev
        Dev dev1 = new Dev();
        dev1.setName("Andre");
        dev1.enrollBootcamp(bootcamp);
        System.out.println("\nEnrolled contents for " + dev1.getName() + "\n" + dev1.getEnrolledDev());
        dev1.progress();
        dev1.progress();
        System.out.println("Concluded contents for " + dev1.getName() + "\n" + dev1.getConcludedDev());
        System.out.println("Expert = " + dev1.calculate());
        // System.out.println(dev1);

        System.out.println("=================================================================");

        // dev instance = new object Dev
        Dev dev2 = new Dev();
        dev2.setName("Leandro");
        dev2.enrollBootcamp(bootcamp);
        System.out.println("\nEnrolled contents for " + dev2.getName() + "\n" + dev2.getEnrolledDev());
        // dev2.progress();
        System.out.println("Concluded contents for " + dev2.getName() + "\n" + dev2.getConcludedDev());
        System.out.println("Expert = " + dev2.calculate());
        // System.out.println(dev2);
    }
}
