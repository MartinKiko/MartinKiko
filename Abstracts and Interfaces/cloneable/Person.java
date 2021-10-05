package cloneable;

public class Person {
    String name;
    int age;

    public enum Gender {
        MALE, FEMALE
    }

    Gender pGender;

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + pGender.toString().toLowerCase() + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public Person() {
        this("Jane Doe", 30, Gender.FEMALE);
    }

    public Person(String name, int age, Gender pGender) {
        this.name = name;
        this.age = age;
        this.pGender = pGender;
    }
}

