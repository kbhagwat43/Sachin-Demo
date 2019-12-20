package javaInterviewOnProgByNaveen;

public class SeperateNumFromString {

	public static void splitString(String str) {

		StringBuffer alpha = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer special = new StringBuffer();

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
	}

	public static void main(String[] args) {

		SeperateNumFromString.splitString("245dssrg&^$YGCsdhjjus87523567");

	}

}
