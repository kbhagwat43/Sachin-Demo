package ProgrammPractice;

public class FactorialNumber {

	public static void factorial(int num) {

		int fact = 1;

		for (int i = num; i >= 1; i--) {

			fact = fact * i;
		}

		System.out.println("Factorial of "+num +" is : "+fact);

	}

	public static void main(String[] args) {

		factorial(3);
	}

}
