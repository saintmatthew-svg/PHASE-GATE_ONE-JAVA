import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class HigestNumberTest {

    @Test
    public void testThatItReturnsTwoHighestNumbers() {
        int[] numbers = {1, 4, 5, 6, 9, 7, 10, 9};
        int[] expected = {10, 9};
        int[] result = HigestNumber.arrayHigestNumber(numbers);
        assertArrayEquals(expected, result);
    }
}
