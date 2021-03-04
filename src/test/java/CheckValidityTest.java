import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CheckValidityTest {

	@Test
	public void test() {
		String output = CreditCardValidation.checkValidity("4111111111111111");
		assertEquals("Valid", output);
		output = CreditCardValidation.checkValidity("4111111111111112");
		assertEquals("Invalid", output);
	}

}