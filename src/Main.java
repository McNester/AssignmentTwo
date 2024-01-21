import interfaces.Payable;
import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Asik","Rominsky","Team Lead",100000);
        Employee employee2 = new Employee("Julia","Kowal","Front-end developer",100);
        Employee employee3 = new Employee("Eraly","Askarin","Back-end developer",50);

        Student student1 = new Student("Arman", "Kojamuhanov", 4.0);
        Student student2 = new Student("Viktor", "Suprunov", 5.0);
        Student student3 = new Student("Hoji", "Yoshin", 2.3);

        ArrayList<Person> people = new ArrayList<>();

        people.add(employee2);
        people.add(employee1);
        people.add(employee3);

        people.add(student1);
        people.add(student2);
        people.add(student3);

        Collections.sort(people);

        printData(people);



    }
    public static void printData(Iterable<Person> people){
        for (Person p : people) {
            System.out.println(p + " earns " + p.getPaymentAmount() + " tenge");
        }
    }
}
