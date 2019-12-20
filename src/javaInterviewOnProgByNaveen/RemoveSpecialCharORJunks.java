package javaInterviewOnProgByNaveen;

public class RemoveSpecialCharORJunks {
	
	public static void main(String[] args) {
		
		//Que: How will remove the Junk char/Unwanted char from a String?
		//Ans- By using Regular Expression in replaceAll() method
		
		String s="$%#@^&*(^^((^(^()* Sachin WANKHADE *^%$%%EE^E 1234567890 ?><:)(&%&&";
		
		//Regular expression: [^a-zA-Z0-9] expecting only a-z A-Z 0-9 others ^(not)
		
		String str=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("String is:"+str);
	}

}
