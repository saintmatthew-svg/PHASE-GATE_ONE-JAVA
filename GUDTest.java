import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GUDTest {

	@Test
	public void testthatgudreturnscorrectvalue(){
		int number1 = 4;
		int number2 = 2;
		int expected = 2;
		int result = GUD.simpleTask(number1, number2);
		assertEquals(expected, result);
		
	}

}