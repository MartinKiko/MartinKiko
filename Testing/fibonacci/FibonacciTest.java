package fibonacci;

import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testingFuctionality() {
        Fibonacci fibonacci = new Fibonacci(5);
        assertEquals(5, fibonacci.getResult());
    }

    @Test
    public void testingOne() {
        Fibonacci fibonacci = new Fibonacci(1);
        assertEquals(1, fibonacci.getResult());
    }

    @Test
    public void testZero() {
        Fibonacci fibonacci = new Fibonacci(0);
        assertEquals(0, fibonacci.getResult());
    }

    @Test
    public void testingNegative() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
           Fibonacci fibonacci = new Fibonacci(-5);
        });

        String expectedMessage = "Negative position";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}


