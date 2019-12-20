package StringLogicalPrograms;

public class CountCharactorInString {

	public static void main(String[] args) {

		String str = "Sachin Wankhade";
		int count = 0;

		char[] charArr = str.toCharArray();

		for (int i = 0; i < charArr.length; i++) {

			count = 0;
			
			for (int j = 0; j < charArr.length; j++) {
				
				if (charArr[i] == charArr[j]) {
					
					count++;
				}
			}

			System.out.println(charArr[i]+":" + count);
		}

	}

}
