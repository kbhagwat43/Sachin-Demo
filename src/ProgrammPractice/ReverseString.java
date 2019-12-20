package ProgrammPractice;

public class ReverseString {

	public static void reverse(String str) {

		char charArr[] = str.toCharArray();
		int len =charArr.length;
		for (int i = len -1  ; i >= 0; i--) {

			System.out.print(charArr[i]);
		}

	}

	public static void main(String[] args) {

		reverse("sachin");
	}

}
