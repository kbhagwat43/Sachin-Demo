package ProgrammPractice;

public class PalindromNumber {

	// 151

	public static void checkPalindrom(int num) {

		int rev = 0, sum = 0;
		int temp = num;
		while (num > 0) {

			rev = num % 10;
			sum = (sum * 10) + rev;
			num = num / 10;

		}

		if (temp == sum) {
			
			System.out.println(temp + " is palindrom.");
			
		} else {

			System.out.println(temp + " is not palindrom.");
		}

	}

	public static void main(String[] args) {

		checkPalindrom(151);
	}

}
