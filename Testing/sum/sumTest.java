package sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

        /*
            Follow these steps:
            Add a new test case
            Instantiate your class
            create a list of integers
            use the assertEquals to test the result of the created sum method
            Run them
            Create different tests where you test your method with:
            an empty list
            a list that has one element in it
            a list that has multiple elements in it
            a null
            Run them
            Fix your code if needed
         */

class sumTest {

    @Test
    public void testingSum() {
        List<Integer> arrayTest = new ArrayList<>();
        arrayTest.add(1);
        arrayTest.add(2);
        arrayTest.add(3);

        Sum sum = new Sum(arrayTest);

        assertEquals(6, sum.sumTheArray());
    }
    @Test
    public void emptyList() {
        Sum sum = new Sum(new ArrayList<>());

        assertEquals(0, sum.sumTheArray());
    }
    @Test
    public void oneSizeList() {
        List<Integer> arrayTest = new ArrayList<>();
        arrayTest.add(1);
        Sum sum = new Sum(arrayTest);
        assertEquals(1, sum.sumTheArray());
    }
    @Test
    public void testNull() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Sum sum = new Sum(null);
        });

        String expectedMessage = "Array can not be empty";
        String actualMessage = exception.getMessage();

        assertTrue (actualMessage.contains(expectedMessage));
    }

}



