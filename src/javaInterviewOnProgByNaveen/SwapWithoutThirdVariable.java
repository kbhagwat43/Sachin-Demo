package javaInterviewOnProgByNaveen;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before Swapping: A:" + a + " B:" + b);

		// 1.with 3rd Variable
//		int temp = 0;
//		temp = a;
//		a = b;
//		b = temp;

		// 2.without 3rd variable:using + operator
//		a = a + b;// 10+20=30
//		b = a - b;// 30-20=10
//		a = a - b;// 30-10=20

		// 3.without 3rd variable:using * operator
//		a = a * b;// 200
//		b = a / b;// 10
//		a = a / b;// 20

		// 4.using XOR: ^ (conversion of decimal to binary)
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After Swapping: A:" + a + " B:" + b);
	}

}
