import static org.junit.Assert.*;

import org.junit.Test;

public class OddSumTest {

	@Test
	public void test() {
		int output = CreditCardValidation.oddSum("123456789");
		assertEquals(20,output);
		output = CreditCardValidation.oddSum("13000002");
		assertEquals(5,output);
	}

}
