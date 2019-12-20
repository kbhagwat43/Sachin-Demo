package javaInterviewOnProgByNaveen;

public class CheckNumericInString {

	public static boolean isEmpty(CharSequence cs) {

		return cs == null || cs.length() == 0;

	}
	public static boolean isNumeric(CharSequence cs) {
		if(isEmpty(cs)) {
			return false;
		}
		
		int len = cs.length();
		
		for(int i =0 ;i <len ;i++) {
			if( ! Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)  {

		System.out.println(isNumeric(null));//false
		System.out.println(isNumeric(""));//false
		System.out.println(isNumeric(" "));//false
		System.out.println(isNumeric("a"));//false
		System.out.println(isNumeric("1"));//true ---String containing only numeric value
		System.out.println(isNumeric("a123"));//false
		System.out.println(isNumeric("123abc"));//false
		System.out.println(isNumeric("2.3"));//false -its double not numeric
		System.out.println(isNumeric("+123"));//false
		System.out.println(isNumeric("0"));//true ---String containing only numeric value
		
		System.out.println(isNumeric("\u0967"));//true-- some unicode character that contain some digit will return true.
		
	}

}
