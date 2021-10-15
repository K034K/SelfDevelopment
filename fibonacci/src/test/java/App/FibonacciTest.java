package App;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
	@Test
	public void test() {
		Integer[] fibonacci = {1, 1, 2, 3, 5, 8, 13 };
		Integer[] calculated = Fibonacci.calculate(7);
		assertArrayEquals(fibonacci,calculated);
	}
}