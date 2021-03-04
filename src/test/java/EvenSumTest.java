import static org.junit.Assert.*;

import org.junit.Test;

public class EvenSumTest {

	@Test
	public void test() {
		int output = CreditCardValidation.evenSum("123456789");
		assertEquals(23,output);
		output = CreditCardValidation.evenSum("13000002");
		assertEquals(2,output);
	}

}
