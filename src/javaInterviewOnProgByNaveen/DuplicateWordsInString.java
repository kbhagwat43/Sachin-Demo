package javaInterviewOnProgByNaveen;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	public static void findDuplicate(String inputString) {
		// split
		String[] words = inputString.split(" ");

		//create one hashmap
		HashMap<String, Integer> wordCount = new HashMap<>();

		for (String word : words) {
			//if word is present
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);//increase the counter by 1
			} else {
				wordCount.put(word.toLowerCase(), 1); //or set occurrence as 1
			}
		}

		//extracting all the keys of map : wordCount
		Set<String> wordInString = wordCount.keySet();
		//loop through all the word in wordCount
		for (String word : wordInString) {
			//if word is present more than 1 then its duplicate.
			if (wordCount.get(word) > 1) {

				System.out.println("Duplicate words:" + word + " times:" + wordCount.get(word));
			}
		}

	}
	public static void main(String[] args) {
		findDuplicate("hey java is java best language is java");
		findDuplicate("100 100 1001 2002 2002 100");
		
	}

}
