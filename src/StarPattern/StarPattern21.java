package StarPattern;

public class StarPattern21 {

	public static void main(String[] args) {
		// output:
		/*
		  //diagonal cross star pattern
		 
		 					****
		 					*  *
		 					*  *
		 					****

	
		 
		 */

		
		for (int i = 1; i <=4; i++) {
			
			for (int j = 1; j <= 4; j++) {
				
				if(i>= 2 && j>= 2 && i<=3 && j<=3) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
