package app;

import java.util.Arrays;

public class Reverser {
	static String reverse(String str){
			char[] arr=str.toCharArray();
			char[] arrReverse=Arrays.copyOf(arr,arr.length);
			//System.out.println(arrReverse.length);
		for (int i=0;i<arr.length;i++) {
			arrReverse[arrReverse.length-1-i] = arr[i];
		}
		return String.valueOf(arrReverse);
	}

}
