import java.util.ArrayList;
import java.util.Collections;

public class listIntroduction1 {
    public static void main(String[] args) {

            ArrayList<String> names = new ArrayList<>();
            names.add("William");
            names.add("John");
            names.add("Amanda");
            //names.remove(0);
            //names.remove(1);
            //names.remove(2);
            //names.add(names.get(0));

        System.out.println("Number of elements is: " + names.size());

        if (names.size() == 0) {
            System.out.println("List is empty");
        }   else {
            System.out.println("List is not empty");
        }

        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        int y= 1;
        for(int i=0;i<names.size();i++){
            System.out.println(y++ + ". " + names.get(i));
        }

        String[] names1 = new String[] {"John"};
        System.out.println(names);
        System.out.println(names.get(2));

        Collections.reverse(names);
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));


        }

    }
}
/*
1. Create an empty list which will contain names (strings) - OK

2. Print out the number of elements in the list - OK

3. Add William to the list - OK

4. Print out whether the list is empty or not - OK

5. Add John to the list - OK

6. Add Amanda to the list - OK

7. Print out the number of elements in the list - OK

8. Print out the 3rd element - OK

9. Iterate through the list and print out each name - OK
    William
    John
    Amanda

10. Iterate through the list and print - OK
    1. William
    2. John
    3. Amanda

11. Remove the 2nd element - OK

12. Iterate through the list in a reversed order and print out each name - OK
    Amanda
    William

13. Remove all elements - OK
 */