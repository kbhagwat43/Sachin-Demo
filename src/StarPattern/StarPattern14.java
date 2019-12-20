package StarPattern;

public class StarPattern14 {

	public static void main(String[] args) {
		// output:
		/*
		
		 *******
		  *****
		   ***
		    *
		
		
		 */

		
		for(int i = 1 ; i <= 4; i++) {
			
			
			//for space
			for (int j = 1; j <= i ; j++) {
				System.out.print(" "); 
			}
			
			//for printing *
			for(int k = 4 ; k >= i; k--) {
				System.out.print("*");
			}
			
			//For printing *
			for(int l= 3 ; l >= i;l--) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		
		
	}

}
