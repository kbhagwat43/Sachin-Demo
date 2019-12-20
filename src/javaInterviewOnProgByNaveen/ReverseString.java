package javaInterviewOnProgByNaveen;

public class ReverseString {

	public static void main(String[] args) {
		//Ques: Reverse a String?
		//diff betn String and String Buffer?
		//do we have reverse() method in String?
		String s= "Sachin wankhade";
		//1:Using for loop
		System.out.println("Forword String is>> "+s);
		int len = s.length();
		char [] arr = s.toCharArray();
		System.out.print("Reverse String is >>");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]);
		}
		//another way of logic using for loop
		String rev ="";
		for (int i = len-1; i >= 0; i--) {
			rev= rev + s.charAt(i);
		}
		System.out.println("\nReverse String is:"+rev);

		/**
		 * String buffer has reverse method because it is mutable,but As a String is immutable,it don't have reverse method  
		 */
		//2.Using StringBuffer class
		
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
