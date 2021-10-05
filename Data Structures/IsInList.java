/*import java.util.*;
public class IsInList{
  public static void main(String... args){
    List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);
    checkNumbers(numbers);
    // Check if "numbers" list contains all of the following elements: 4,8,12,16
    // Create a method that accepts a list as an input
    // It should return "true" if the list contains all elements, otherwise returns "false"
  }
}*/
import java.util.*;
public class IsInList {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(numbers);
        // Check if "numbers" list contains all of the following elements: 4,8,12,16
        // Create a method that accepts a list as an input
        // It should return "true" if the list contains all elements, otherwise returns "false"
    }
    public static void checkNums(ArrayList numbers) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        String a = "";
        if (numbers.containsAll(list) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}