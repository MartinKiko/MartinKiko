package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    public void testingRegularFunctionality1() {
        Anagram ana = new Anagram("silent", "tnelis");
        assertEquals(true, ana.isAnagram());
    }

    @Test
    public void testingRegularFuctionality2() {
        Anagram ana = new Anagram("silent", "tnelis");
        assertEquals(false, ana.isAnagram());
    }

    @Test
    public void testingNull() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Anagram ana = new Anagram(null,null);
        });

        String expectedMessage = "No words entered";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

}
