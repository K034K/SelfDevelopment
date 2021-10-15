package App;

import java.util.HashMap;
import java.util.Objects;

public class Anagram {

	public static Boolean checker(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		HashMap<Character, Integer> s1Letter = new HashMap<>();
		HashMap<Character, Integer> s2Letter = new HashMap<>();
		for (char c : arr1) {
			if (!s1Letter.containsKey(c)) {
				s1Letter.put(c, 1);
			} else {
				s1Letter.replace(c, s1Letter.get(c) + 1);
			}
		}
		for (char c : arr2) {
			if (!s2Letter.containsKey(c)) {
				s2Letter.put(c, 1);
			} else {
				s2Letter.replace(c, s2Letter.get(c) + 1);
			}
		}
		for (char c : arr1) {
			if (!Objects.equals(s1Letter.get(c), s2Letter.get(c))) {
				return false;
			}
		}

		return true;
	}
}
