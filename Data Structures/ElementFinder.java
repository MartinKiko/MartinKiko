import java.util.*;

public class ElementFinder{

    public static void main(String... args){

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));

        // Write a method that checks if the arrayList contains "7"
        // If it does: return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }
    public static String containsSeven(ArrayList check) {

        String a = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hooooray", "Nooooo"));

        if (check.contains(7)) {
            a = list.get(0);

        } else {

            a = list.get(1);

        }

        return a;

    }

}