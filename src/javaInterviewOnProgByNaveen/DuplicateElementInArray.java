package javaInterviewOnProgByNaveen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		String names[] = {"java","javascript","ruby","python","c","c++","java","C","c"};

		//1:Compare each element: O(n*n) approach:very time consuming to compare each element: worst approach
		for(int i=0 ; i<names.length;i++) {
			
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i]==names[j]) {
					
					System.out.println("Duplicate element::"+names[i]);
				}
			}
		}
		
		System.out.println("================");
		/**
		 * 2:using HashSet: is kind of java collection class which stores only unique values: time complexity is O(n)
		 * It won't allow duplicate values,if we trying to add value which is already in HashSet then it will just ignore it and return false.
		 */
		 
		Set<String> store = new HashSet<String>();
		for(String element : names) {
			if(store.add(element) == false) {
				System.out.println("Duplicate element is::"+element);
			}
		}
		
		System.out.println("============================");
		/**
		 * 3.Using HashMap: kind of java collection class which implementing Map interface. time Complexity is O(2n).
		 * - values can be stored in HashMap in the form of Key and Value pair.
		 * -Duplicate value can be allowed in HashMap but Only one null key is allowed.
		 * -When we put first values then it will return null value.
		 * -If the key is already present in the map and we are trying to put value with the same key then it will return previous key value
		 *  first and after iterating it will return updated value.  
		 * 
		 */
		String names1[] = {"java","javascript","ruby","python","c","c++","java","C","c"};
		
		Map<String,Integer> mapStore = new HashMap<String,Integer>();
		
		for(String name : names1) {
			Integer count = mapStore.get(name);//mapStore is empty and we are not putting any value to map,hence it return null.
//			System.out.println(count);
			if(count == null) {
				mapStore.put(name, 1);//key is java and value is 1 i.e occurrence
			}else
			{
				mapStore.put(name, ++count);
			}
			
		}
		
		//get the values from HashMap
		//mapStore.keySet();
		Set<Entry<String,Integer>> entrySet=mapStore.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate Value is ::"+entry.getKey());
			}
		}
	}

}
