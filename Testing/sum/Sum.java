package sum;

        /*
            Create a sum method in your class which has an ArrayList of Integers as parameter
            It should return the sum of the elements in the list
        */

import java.util.ArrayList;
import java.util.List;

public class Sum {

    private List<Integer> arr;

    public Sum(List<Integer> arr) {
        if (arr == null) {
            try {
                throw new IllegalAccessException("Array con not be empty");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        this.arr = new ArrayList<>();
        this.arr = arr;
    }


    public int sumTheArray() {
        int sum = 0;
        for (Integer s : arr) {
            sum += s;
        }
        return sum;
    }

}
