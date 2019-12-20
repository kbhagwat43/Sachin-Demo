package StarPattern;

public class StarPattern20 {

	public static void main(String[] args) {
		// output:
		/*
		  //diagonal cross star pattern
		 
		 				*   *
		 				 * * 
		 				  *  
		 				 * * 
		 				*   *

	
		 
		 */

		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if(i== j ||  i+j == 5-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
