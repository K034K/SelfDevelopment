package App;


public class Fibonacci {
	public static Integer[] calculate(Integer index) {
		if (index < 2) {
			throw new IllegalArgumentException();
		}
		Integer[] fibonaci = new Integer[index];
		fibonaci[0] = 1;
		fibonaci[1] = 1;
		for (int i = 2; i < index; i++) {
			fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
		}
		return fibonaci;
	}
}
