import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class SimpleRemoveDuplicatesTest {

    @Test
    public void testThatItReturnsSumOfTheUniqueElement() {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8};
        int[] expected = {1,2,3,4,5,6,7,8};
        int[] result = SimpleRemoveDuplicates.removeDuplicates(numbers);
        assertArrayEquals(expected, result);
    }
}
