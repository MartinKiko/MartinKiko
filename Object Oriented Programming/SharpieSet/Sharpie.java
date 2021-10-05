package SharpieSet;

public class Sharpie {

        /*
        Reuse your Sharpie class
        Create SharpieSet class
        it contains a list of Sharpie
        it has a method that adds a new Sharpie to the set: add(sharpie)
        it has a method that returns the number of usable Sharpies:
        countUsable() -> sharpie is usable if it contains ink
        it has a method that removes all unusable Sharpies: removeTrash()
        */

    public String color;
    public float width;
    public float inkAmount;

    public Sharpie(String color, float width) {
        inkAmount = 100;
        this.width = width;
        this.color = color;
    }
    public void use(float inkAmoundDecrease) {
        inkAmount -= inkAmoundDecrease;
    }

}
