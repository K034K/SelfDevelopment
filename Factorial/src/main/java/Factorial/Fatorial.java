package Factorial;

class Factorial {
	public static Integer calculate(Integer index) {
		int result = 1;
		for (int i = 1; i <= index; i++) {
			result *= i;
		}
		return result;
	}

}
