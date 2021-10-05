package SharpieSet;

import java.util.ArrayList;
import java.util.Arrays;

        /*
        Reuse your Sharpie class
        Create SharpieSet class
        it contains a list of Sharpie
        it has a method that adds a new Sharpie to the set: add(sharpie)
        it has a method that returns the number of usable Sharpies:
        countUsable() -> sharpie is usable if it contains ink
        it has a method that removes all unusable Sharpies: removeTrash()
        */

public class SharpieSet {
    ArrayList<Sharpie> list = new ArrayList<>();

    public SharpieSet() {

    }

    public void addSharpies(Sharpie pen) {
        list.add(pen);

    }

    public int countUsable() {
        int usable = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).inkAmount > 0) {
                usable++;
            }
        }
        return usable;
    }

    public void removeTrash() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).inkAmount == 0) {
                list.remove(list.get(i));
            }
        }
    }
    public void printList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).inkAmount + "\n" + list.get(i).color + "\n" + list.get(i).width);
        }
    }
}
