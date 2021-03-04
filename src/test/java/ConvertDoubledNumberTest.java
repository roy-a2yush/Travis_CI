import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertDoubledNumberTest {

	@Test
	public void test() {
		int output = CreditCardValidation.convertDoubledNumber(14);
		assertEquals(5,output);
		output = CreditCardValidation.convertDoubledNumber(10);
		assertEquals(1,output);
	}

}
