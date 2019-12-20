package StarPattern;

public class StarPattern9 {

	public static void main(String[] args) {
		// output:
		/*  
		 	     *
		 	    **
		 	   ***
		 	  ****

		 
		*/

		//for row only
		for (int i = 1; i <= 4; i++) {

			//to print space only
			for (int j = 4; j >= i; j--) {

				System.out.print(" ");
			}

			//to print * 
			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
