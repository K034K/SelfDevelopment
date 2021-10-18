package Factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FatorialTest {
	@Test
	void test() {
		assertEquals(40320, Factorial.calculate(8));

	}
}