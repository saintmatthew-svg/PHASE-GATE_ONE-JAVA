import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumOfUniqueElementTest {

    @Test
    public void testThatItReturnsSumOfTheUniqueElement() {
        int[] numbers = {1, 2, 3, 2};
        int expected = 4;
        int result = SumOfUniqueElement.sumUniqueElements(numbers);
        assertEquals(expected, result);
    }
}

