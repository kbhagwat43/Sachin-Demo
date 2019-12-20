package StarPattern;

public class StarPattern12 {

	public static void main(String[] args) {
		// output:
		/*  
		 	    
		     *
		    * *
		   * * *
		  * * * *
		
		 
		*/

/*	//1. 1st approach	
  		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
*/

		// 2.2nd Approach

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");//space
				} else {
					System.out.print(" *"); // space and then *
				}
			}
			System.out.println();
		}

	}

}
