import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringOccurancesTest {

    @Test
    public void testThatItReturnsSumOfTheUniqueElement() {
	String input = "hello world";
	char letter = 'o';
        int expected = 2;
        int result = StringOccurances.countOccurrences(input,letter);
        assertEquals(expected, result);
    }
}
