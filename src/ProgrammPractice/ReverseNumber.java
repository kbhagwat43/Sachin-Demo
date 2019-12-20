package ProgrammPractice;

public class ReverseNumber {

	public static void checkReverseNum(int num) {
		int rev = 0;
		int rem = 0;

		System.out.println("Before Reverse :" + num);

		while (num != 0) { //12345
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println("After Reverse:" + rev);
	}

	public static void main(String[] args) {
		
		ReverseNumber.checkReverseNum(12345);
		ReverseNumber.checkReverseNum(345);

	}

}
