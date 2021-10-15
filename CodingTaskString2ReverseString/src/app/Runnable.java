package app;

public class Runnable {
	public static void main(String[] args) {
		for (String arg:
		     args) {
			System.out.println(arg+" reversed "+Reverser.reverse(arg));
		}

	}
}
