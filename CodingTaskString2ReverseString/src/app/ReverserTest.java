package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverserTest {
	@Test
	void reverseTest() throws Exception {
		String testName = "ad2_1";
		assertEquals("1_2da", Reverser.reverse(testName));
	}
}