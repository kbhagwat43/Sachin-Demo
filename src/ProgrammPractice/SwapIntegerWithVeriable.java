package ProgrammPractice;

public class SwapIntegerWithVeriable {

	public static void swapWithThirdVariable(int a, int b) {
		int temp;

		System.out.println("Before swapping:A :" + a + " B: " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping:A :" + a + " B: " + b);

	}

	public static void swapWithoutThirdVariable(int a, int b) {
		System.out.println("Before swapping:A :" + a + " B: " + b);

		a = a + b;
		a = a - b;
		b = a - b;

		System.out.println("After swapping:A :" + a + " B: " + b);

	}

	public static void main(String[] args) {

		swapWithThirdVariable(10, 20);
		swapWithThirdVariable(30, 40);

	}

}
