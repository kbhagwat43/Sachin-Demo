package StarPattern;

public class StarPattern6 {

	public static void main(String[] args) {
		// output:
		
	/*  						i   j
	  		*					1	1 <-- printing 1 *		
			* *					2	2 <-- printing 2 * like wise		
			* * *				3	3
			* * * *				4	4
	*/
	
		for (int i = 1; i <= 4; i++) {

			//j should match with i
			for (int j = 1; j <= i; j++) {  
				
				System.out.print("*");
	
			}
			
			System.out.println();

		}

	}

}
