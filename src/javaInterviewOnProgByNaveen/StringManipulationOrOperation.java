package javaInterviewOnProgByNaveen;

public class StringManipulationOrOperation {

	public static void main(String[] args) {
		
		String str = "The rains have started todays in pune";
		
		System.out.println(str.length());//length() is function in String class to find out the length of String.
		System.out.println(str.charAt(8));//s
		System.out.println(str.indexOf('s'));//8
		
		/**
		 * Ques: If there might be multiple s in string and we want to find out the 2nd occurrence of s char in string.
		 * then in this case,we have method indexOf(ch, fromIndex);
		 */
		
		System.out.println(str.indexOf('s', 9));//15--hard coded
		System.out.println(str.indexOf('s', str.indexOf('s')+1));//15--Second Occurrence
		
		//for 3rd occurrence
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1));//28 -- Third Occurrence
		
	
		//if particular char is not present in string it will return -1.
		System.out.println(str.indexOf('z')); //-1

		/**
		 * trim:to remove only before space and after space.
		 * There are 3 types of spaces
		 * 1.Before space 2.middle space 3.After space
		 * 
		 */
		
		String s= "      Hello World     ";
		System.out.println(s.trim());//Hello World
		//what if,wanna remove middle space too
		System.out.println(s.replace(" ", ""));
		//System.out.println(s.split(" "));//it will return address
		
		//comparing two Strings
		String s1="Sachin Wankhade";
		String s2="Sachin Wankhade";
		String s3="Sachin wankhade";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equalsIgnoreCase(s3));//True
		
		
		//concatenation
		String s4="hello";
		String s5="world";
		
		int a=100;
		int b=200;
		
		System.out.println(s4+s5);//helloworld
		System.out.println(s4+a);//hello100
		System.out.println(s4+s5+a+b);//helloworld100200
		System.out.println(a+b+s4+s5);//300helloworld
		System.out.println(s4+s5+(a+b));//helloworld300
		

		//spilt-remove the char using regular expression and returns String[].
		//so if we store the output of split() into a String variable,it will give us compile time error.i5
		String test= "Hello_world_Welcome_Sachin";
		String [] x=test.split("_");
		for (int i = 0; i < x.length; i++) {
			System.out.print(" "+x[i]);// Hello world Welcome Sachin
			
		}
		
		System.out.println();
		//SubString
		String s6="Sachin";
		System.out.println(s6.substring(1, 4));//ach ---1st index-include and 2nd index-exclude
		
	}

}
