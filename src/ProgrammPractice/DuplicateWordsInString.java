package ProgrammPractice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	public static void checkDuplicates(String str) {
		
		System.out.println("Given string is:"+str);
		String [] strArr =str.split(" ");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for (String element : strArr) {
			
			if(map.containsKey(element)) {
				map.put(element, map.get(element)+1);
			}else {
				map.put(element, 1);
			}
			
		}
		
		Set <String> keys =map.keySet();
		for (String  element : keys) {
			
			if(map.get(element) > 1){
				System.out.println("Duplicate word :"+element+"-----"+ map.get(element)+" Times.");
			}
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {

		checkDuplicates("java is lang java is best");
		
		
	}

}
