package countletters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountLettersTest {

    @Test
    public void testingOccurencOfLettersInString() {
        CountLetters sentence = new CountLetters("Hello, how are you");
        assertEquals(2, sentence.getDictionary().get("e"));
    }

    @Test
    public void testingEmptyString() {
        CountLetters sentence = new CountLetters("");

        Exception exception = assertThrows(RuntimeException.class, sentence::getDictionary);

        String expectedMessage = "No words entered";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testingNull() {
        CountLetters sentence = new CountLetters(null);

        Exception exception = assertThrows(RuntimeException.class, sentence::getDictionary);

        String expectedMessage = "No words entered";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

}
