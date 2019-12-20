package StarPattern;

public class NumericPattern1 {

	public static void main(String[] args) {
		// output:
		/*
		 
		 */

		
		for (int i = 1; i <=4; i++) {
			
			for (int j = 1; j <= i; j++) {
				
//				System.out.print("*");
				/*
				 o/p 
						*
						**
						***
						****

				*/
				
				
//				System.out.print(j);
				/*
				 o/p 
						1
						1 2
						1 2 3
						1 2 3 4

				*/
				
				System.out.print(i);
				
			/*	
			 * o/p
			    1
				22
				333
				4444

				*/
			}
			System.out.println();
		}
		
		
		
	}

}
