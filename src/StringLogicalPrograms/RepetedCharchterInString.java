package StringLogicalPrograms;

public class RepetedCharchterInString {

	public static void main(String[] args) {
		
		String str = "Sachin Wankhade";
		int count=0;
		
		char[] charArr=str.toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			
			System.out.print(charArr[i]);
			
			//String c= Integer.toString(charArr[i]);
			//System.out.println(c);
			
			if(charArr[i] == 'a') {
				count =count+1;
			}
		
		}
		System.out.println("\nNumber of 'a' present in "+str+" is:"+count);
		

	}

}
