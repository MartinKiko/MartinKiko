package SharpieSet;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        Reuse your Sharpie class
        Create SharpieSet class
        it contains a list of Sharpie
        it has a method that adds a new Sharpie to the set: add(sharpie)
        it has a method that returns the number of usable Sharpies:
        countUsable() -> sharpie is usable if it contains ink
        it has a method that removes all unusable Sharpies: removeTrash()
        */

        Sharpie black = new Sharpie("Black", 44f);
        Sharpie white = new Sharpie("White", 55f);
        Sharpie red = new Sharpie("Red", 333f);
        Sharpie green = new Sharpie("Green", 67f);
        SharpieSet tolltarto = new SharpieSet();
        tolltarto.addSharpies(black);
        tolltarto.printList();

    }
}
