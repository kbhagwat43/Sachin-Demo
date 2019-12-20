package ProgrammPractice;

public class LargestAndSmallestElement {

	public static void checkLargeNumber() {

		int arr[] = { 10, 2, 2, 3, 4, 5, 98, 4, 9 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		System.out.println("Large number is:"+max);
	}

	public static void checkSmallNumber() {

		int arr[] = { 10, 2, 2, 3, 4, 5, 98, 4, 9 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if(min > arr[i]) {
				min = arr[i];
			}
			
		}
		
		System.out.println("small number is:"+min);
	}

	public static void main(String[] args) {

		checkLargeNumber();
		checkSmallNumber();
	}

}
