package AppPolyndrome;

public class Runnable {
	public static void main(String[] args) {
		for (String str : args) {
			System.out.println(str + "-" +PolyndromeChecker.checker(str));
		}
	}
}
