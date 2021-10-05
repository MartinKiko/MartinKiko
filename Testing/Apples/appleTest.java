package Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

        /*
                Create a test for that.
                Create a test class
                Create a test method
                Instantiate an Object from your class in the method
                Use the assertEquals()
                The expected parameter should be the same string (eg. "apple")
                The actual parameter should be the return value of the method (eg. myObject.getApple())
                Run the test
                Change the expected value to make the test failing
                Run the test
                Fix the returned value to make the test succeeding again
        */

public class appleTest {

    @Test
    public void testTheOutputString(){
        apple test = new apple();
        String expectedValue = "apple";
        String resultValue = test.getApple();
        assertEquals(expectedValue, resultValue);

    }
}