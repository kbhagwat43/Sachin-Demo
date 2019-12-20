package javaInterviewOnProgByNaveen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class DifferentIteratorInCollection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sachin");
		list.add("Nilesh");
		//1.Using jdk 1.8 for each loop and lambda expression
		
		list.forEach(al -> {
			System.out.println(al);
		});		
		System.out.println("=========");
		for(String al : list) {
			System.out.println(al);
		}
		System.out.println("=========");
		
		//2. Using Iterator:
		Iterator<String> itr =list.iterator();
		while(itr.hasNext()) {
			String s= itr.next();
			System.out.println(s);
		}
		System.out.println("=========");
		//4.Using Iterator and java 8 lambda and forEachRemaining() method
		itr =list.iterator();
		itr.forEachRemaining(al -> {
			System.out.println(al);
		});
		System.out.println("=========");
		//5.Using ListIterator
		ListIterator<String> litr =list.listIterator(list.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());//it will traversing at backward direction
		}
		System.out.println("=========");
		//6.Using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
