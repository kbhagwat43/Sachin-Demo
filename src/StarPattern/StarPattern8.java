package StarPattern;

public class StarPattern8 {

	public static void main(String[] args) {
		// output:
	/*  
	 	*
	 	* *
	 	* * *
	 	* * * *
	 	* * *
	 	* *
	 	*
	 
	*/
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {
				
				System.out.print("*");
	
			}
			
			System.out.println();

		}

	}

}
