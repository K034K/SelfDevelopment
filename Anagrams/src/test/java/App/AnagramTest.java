package App;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramTest {
	@Test
	void test1() {
		assertEquals(true, Anagram.checker("abcd", "dabc"));
		assertEquals(true, Anagram.checker("aaaa", "aaaa"));
		assertEquals(false, Anagram.checker("aqua", "quaq"));
	}
	@Test
	void test2() {
		assertEquals(false, Anagram.checker("abcde", "dabc"));
	}

}