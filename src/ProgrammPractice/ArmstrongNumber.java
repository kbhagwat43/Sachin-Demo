package ProgrammPractice;

public class ArmstrongNumber {

	public static void checkArmstrongNum(int num) {

		int temp = num;
		int rem = 0;
		int sum = 0;

		while (num != 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println("The given number :" + temp + " is Armstrong Number.");
		} else {
			System.out.println("The given number :" + temp + " is not Armstrong Number.");
		}

	}

	public static void main(String[] args) {

		ArmstrongNumber.checkArmstrongNum(153);
		ArmstrongNumber.checkArmstrongNum(121);

	}

}
