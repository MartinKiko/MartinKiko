import java.util.ArrayList;
import java.util.List;

public class Unique {
    public static void main(String[] args) {
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    }
    public static ArrayList<Integer> unique(int[] list) {
        ArrayList<Integer> uni = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (!uni.contains(list[i])) {
                uni.add(list[i]);
            }
        }
        return uni;
    }
}
        //  Create a function that takes an array of numbers as a parameter
        //  and returns an array of integers where every integer is unique (occurs only once)
        //  Example
        //  System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

