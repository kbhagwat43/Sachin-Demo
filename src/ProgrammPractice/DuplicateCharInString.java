package ProgrammPractice;

public class DuplicateCharInString {

	public static void checkDuplicate(String str) {

		char[] charArr = str.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					System.out.println("Duplicate char :"+charArr[i]);
				}
			}
		}

	}

	public static void main(String[] args) {

		checkDuplicate("sachinwankhade");

	}

}
