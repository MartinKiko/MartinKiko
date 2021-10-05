import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
         /*
        1. Create a list ('List A') which contains the following values
           Apple, Avocado, Blueberries, Durian, Lychee -------------------------------- OK
        2. Create a new list ('List B') with the values of List A --------------------- OK
        3. Print out whether List A contains Durian or not ---------------------------- OK
        4. Remove Durian from List B -------------------------------------------------- OK
        5. Add Kiwifruit to List A after the 4th element ------------------------------ OK
        6. Compare the size of List A and List B -------------------------------------- OK
        7. Get the index of Avocado from List A --------------------------------------- OK
        8. Get the index of Durian from List B ---------------------------------------- OK
        9. Add Passion Fruit and Pomelo to List B in a single statement --------------- OK
        10.Print out the 3rd element from List A -------------------------------------- OK
         */

        //Create a list ('List A') which contains the following values
        //Apple, Avocado, Blueberries, Durian, Lychee
        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");

        //Add Kiwifruit to List A after the 4th element
        ListA.add("Kiwifruit");
        ListA.add("Lychee");

        //Create a new list ('List B') with the values of List A
        ArrayList<String> ListB = new ArrayList<>();
        ListB.add("Apple");
        ListB.add("Avocado");
        ListB.add("Blueberries");
        ListB.add("Durian");
        ListB.add("Lychee");

        //Print out whether List A contains Durian or not
        if (ListA.indexOf("Durian") > -1) {
            System.out.println("ListA contains \"Durian\"");
        } else {
            System.out.println("ListA not contains \"Durian\"");
        }

        //Remove Durian from List B
        ListB.remove(3);

        //Print out the 3rd element from List A
        System.out.println("3rd element from ListA is: " + ListA.get(2));

        //Compare the size of List A and List B
        if (ListA.size() > ListB.size()) {
            System.out.println("ListA: " + ListA.size() + " > ListB: " + ListB.size());
        } else if (ListA.size() < ListB.size()) {
            System.out.println("ListA: " + ListA.size() + " < ListB: " + ListB.size());
        }   else {
            System.out.println("ListA: " + ListA.size() + " = ListB: " + ListB.size());
        }

        //Get the index of Avocado from List A
        System.out.println("Index of Avocado from List A is: " + ListA.indexOf("Avocado"));

        //Get the index of Durian from List B
        System.out.println("Index of Durian from List B is: " + ListB.indexOf("Durian"));

        //Add Passion Fruit and Pomelo to List B in a single statement
        ListB.addAll(Arrays.asList(new String[] {"Passion Fruit", "Pomelo"}));
        //import java.util.Arrays;

        /*
        ListA.add("Apple");
        ListA.add("Apple");
        ListA.add(ListA.get(0));
        ListA.remove(0);
        for(int i=0;i<ListA.size();i++){
            System.out.println(ListA.get(i));
        }
        */
    }
}
