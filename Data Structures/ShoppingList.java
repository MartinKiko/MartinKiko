import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        /*
        We are going to represent a shopping list in a list containing strings.

        1. Create a list with the following items. ------------------------------- OK
           Eggs, milk, fish, apples, bread and chicken
        2. Create an application which solves the following problems.
           Do we have milk on the list? ------------------------------------------ OK
        3. Do we have bananas on the list? --------------------------------------- OK
        */

        //Create a list with the following items.
        ArrayList<String> ShoppingList = new ArrayList<>();
        ShoppingList.add("eggs");
        ShoppingList.add("milk");
        ShoppingList.add("fish");
        ShoppingList.add("apples");
        ShoppingList.add("bread");
        ShoppingList.add("chicken");

        //Do we have milk on the list?
        if (ShoppingList.indexOf("milk") > -1) {
            System.out.println("Shopping list contains \"milk\".");
        } else {
            System.out.println("Shopping list not contains \"milk\".");
        }

        //Do we have bananas on the list?
        if (ShoppingList.indexOf("bananas") > -1) {
            System.out.println("Shopping list contains \"bananas\".");
        } else {
            System.out.println("Shopping list not contains \"bananas\".");
        }

    }
}
