import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class LowestNumberTest {

    @Test
    public void testThatItReturnsTwoLowestNumbers() {
        int[] numbers = {1, 4, 5, 6, 9, 7, 10, 9};
        int[] expected = {1,4};
        int[] result = lowestNumber.arrayLowestNumber(numbers);
        assertArrayEquals(expected, result);
    }
}
