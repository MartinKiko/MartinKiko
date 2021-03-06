package cloneable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, Person.Gender.MALE);
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, Person.Gender.MALE, "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, Person.Gender.MALE, Mentor.Level.SENIOR);
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, Person.Gender.MALE, "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();

        Student newJohn = new Student("John", 20, Person.Gender.MALE, "BME");
        Student johnsClone = (Student) newJohn.clone();

        System.out.println((johnsClone != newJohn)); // true, so OK
        System.out.println((johnsClone.getClass() == newJohn.getClass())); // true, so OK
        System.out.println(johnsClone.equals(newJohn)); // todo Override original method, ensure this returns true

        newJohn.sumUpDetails();
        johnsClone.sumUpDetails();

    }
}