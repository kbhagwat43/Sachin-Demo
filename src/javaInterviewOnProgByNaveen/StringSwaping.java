package javaInterviewOnProgByNaveen;

public class StringSwaping {

	public static void main(String[] args) {

		// We can't perform the arithmetic operation on string
		String a = "hello";
		String b = "world";

		System.out.println("Before Swapping: A : " + a + " B: " + b);

		// 1.append a and b
		a = a + b; // helloworld

		// 2. Store initial String a into string b
		b = a.substring(0, a.length() - b.length()); // hello

		// 3.store initial string b into string
		a = a.substring(b.length());// world

		System.out.println("After Swapping: A : " + a + " B: " + b);

	}

}
