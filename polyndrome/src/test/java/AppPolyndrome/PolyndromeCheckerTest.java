package AppPolyndrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PolyndromeCheckerTest {
	@Test
	void test() throws Exception {
		String testName1 = "abba", testName2 = "tennet", testName3 = "access";
		assertEquals(true, PolyndromeChecker.checker(testName1));
		assertEquals(true, PolyndromeChecker.checker(testName2));
		assertEquals(false, PolyndromeChecker.checker(testName3));

	}

}