package App;

import java.util.HashMap;

public class MostRepeatedWord {
	public static String mostRepeated(String str){
		String[] arr = str.split(" ");
		HashMap<String,Integer> added = new HashMap<>();
		Integer max=0;
		String seeking="";
		for(String s:arr){
			if(!added.containsKey(s)){
				added.put(s,1);
			}else{
				added.replace(s,added.get(s)+1);
				if(max<added.get(s)){
					seeking = s;
				}
			}
		}
		return seeking;
	}

}
