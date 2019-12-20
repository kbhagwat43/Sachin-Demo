package javaInterviewOnProgByNaveen;

public class PalindromeNumber {

	//reverse of number is itself only like 151 is palindrome number.
	public static void isPalindromeNum(int num) {

		int rev = 0 , sum =0;
		int temp = num;
		while(num>0) {
			rev =  num % 10;
			sum = (sum * 10) + rev ;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(temp +" is palindrome.");
			}
		else
			System.out.println(temp +" is not palindrome.");


	}

	public static void main(String[] args) {

		isPalindromeNum(151);
	}

}
