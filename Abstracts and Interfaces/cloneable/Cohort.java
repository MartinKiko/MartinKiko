package cloneable;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    String name;
    List<Student> students;
    List<Mentor> mentors;

    public void addStudent(Student studentName) {
        students.add(studentName);
    }

    public void addMentor(Mentor mentorName) {
        mentors.add(mentorName);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.mentors = new ArrayList<Mentor>();
    }
}
