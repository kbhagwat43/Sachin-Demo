package StarPattern;

public class StarPattern17 {

	public static void main(String[] args) {
		// output:
		/*
		 * //diagonal star pattern
		  	*
		   	 *
		   	  *
		       *
		      *
		     *
		    *  
		 */

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				if (i >= 2 && j <= i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= 4; k++) {

				if (i >= 2 && k >1) {

					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();

		}

	}

}
