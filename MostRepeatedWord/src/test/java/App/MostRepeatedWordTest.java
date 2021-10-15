package App;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostRepeatedWordTest {
	@Test
	public void test(){
		String str = "aaa bb aaaaa cc ccc aaa cc dd dccdc aaaa aaa";
		assertEquals("aaa",MostRepeatedWord.mostRepeated(str));
	}
	 @Test
	public void test1(){
		 String str = "aaa bb aaaaa cc ccc aaa cc dd dccdc aaaa abba abba abba abba";
		 assertEquals("abba",MostRepeatedWord.mostRepeated(str));}

}