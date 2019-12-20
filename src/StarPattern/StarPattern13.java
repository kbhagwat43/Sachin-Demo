package StarPattern;

public class StarPattern13 {

	public static void main(String[] args) {
		// output:
		/*
		 Pyramid without spaces
			  *					1 *
			 ***				3 *
			*****				5 *
		   *******				7 *
		
		
		 */

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			for (int l = 2; l <= i; l++) {
				System.out.print("*");
			}

			System.out.println();

		}

		
		System.out.println("------------");
		
		//2nd approach
		
		for (int x = 1; x <= 4; x++) {
			
			for (int y = 4; y >= x ; y--) {
				
				System.out.print(" ");
			}
			
			for(int z= 1 ; z < (x * 2) ; z++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
