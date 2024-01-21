import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Person e1 = new Employee("Kaneki", "Ken", "Developer", 93000);
        Person e2 = new Employee("Kiyotaka", "Ayanokoji", "Businessman", 1203500);
        Person e3 = new Employee("Kinoshito", "Touka", "Writer", 20000);
        Person e4 = new Employee("Izumi", "Miyamura", "Student", 65010);
        Person e5 = new Employee("Khan", "Ata", "Streamer", 6000000);

        Person s1 = new Student("Shu", "Iura", 2.81);
        Person s2 = new Student("Kono", "Sakura", 2.91);
        Person s3 = new Student("Kyoko", "Horimya", 3.60);
        Person s4 = new Student("Toru", "Ishikawa", 3.01);
        Person s5 = new Student("Honoka", "Sawada", 2.85);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(e3);
        persons.add(e4);
        persons.add(e5);
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(s5);

        Collections.sort(persons);
        printData(persons);
    }

    static void printData(Iterable<Person> persons){

        for (Person person : persons){
            System.out.println(person.printData());
        }
    }
}