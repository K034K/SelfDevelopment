package AppPolyndrome;

import java.util.Arrays;

public class PolyndromeChecker {
	static Boolean checker(String str){
		char[] arr = str.toCharArray();
		char[] arrReversed = Arrays.copyOf(arr,arr.length);
		for(int i=0; i<arr.length;i++){
			if(arr[i]!=arrReversed[arrReversed.length-i-1]){
				return false;
			}
		}
		return true;
	}
}
