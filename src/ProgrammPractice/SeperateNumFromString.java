package ProgrammPractice;

public class SeperateNumFromString {

	public static void splitString(String str) {

		StringBuffer alpha = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer special = new StringBuffer();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));

			} else if (Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));
			} else {
				special.append(str.charAt(i));
			}

		}

		System.out.println("Number from given String is: " + num);
		System.out.println("Charcter from given String is: " + alpha);
		System.out.println("Special char from given String is: " + special);
		System.out.println();
		countNumCharSpecialCharFromString(str);
	}

	public static void countNumCharSpecialCharFromString(String str) {

		char[] ch = str.toCharArray();

		int letter = 0;
		int space = 0;
		int num = 0;
		int OtherSpecialChar = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(ch[i])) {
				num++;

			} else if (Character.isAlphabetic(ch[i])) {
				letter++;

			} else if (Character.isSpace(ch[i])) {
				space++;

			} else {
				OtherSpecialChar++;

			}

		}
		System.out.println("Count of letter: " + letter);
		System.out.println("Count of space: " + space);
		System.out.println("Count of number: " + num);
		System.out.println("Count of other: " + OtherSpecialChar);

	}

	public static void main(String[] args) {

		SeperateNumFromString.splitString("245dssrg&^$YGCsdhjjus87523567");
		System.out.println();
		SeperateNumFromString.splitString("245dssrg&%^%   ^$YGCsd23567");

	}

}
