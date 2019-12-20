package javaInterviewOnProgByNaveen;

public class ReverseNumber {

	public static void main(String[] args) {

		//1: Using proper algorithm
		int num = 12345;// 54321
		int rev = 0;
		while (num != 0) {

//			int temp = num % 10;
//			rev = rev * 10 + temp;
//			num = num / 10;
			rev= rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse Integer:" + rev);
		
		//2:Using StringBuffer Class
		int num1= 1234567;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
