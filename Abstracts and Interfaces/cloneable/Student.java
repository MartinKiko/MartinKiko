package cloneable;

public class Student extends Person implements Cloneable {

    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, Gender pGender, String previousOrganization) {
        super(name, age, pGender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super("Jane Doe", 30, Gender.FEMALE);
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year-old " + pGender.toString().toLowerCase() + " from "
                + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    @Override
    public Object clone() {
        Student studentClone = null;
        try {
            studentClone = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Hops, cloning is not supported");
            return -1;
        }

        studentClone.name = name;
        studentClone.age = age;
        studentClone.pGender = pGender;
        studentClone.previousOrganization = previousOrganization;
        studentClone.skippedDays = skippedDays;
        return studentClone;
    }

    public void sumUpDetails() {
        System.out.println("Hi, my name is " + name + ", I am a " + age + " year old " + pGender.toString()
                + ", from " + previousOrganization + ", and I've skipped " + skippedDays + " days so far. My object memory source is: " + this);
    }

    //todo
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
