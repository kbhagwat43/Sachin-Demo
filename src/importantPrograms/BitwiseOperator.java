package importantPrograms;
//Bitwise operator
public class BitwiseOperator {
	
		public static void main(String[] args) {
			int a =2;
			int b =4;
			System.out.println("Value of a before:"+a);
			System.out.println("Value of b before:"+b);
			
			// bitwise unary compliment operator ~(bitwise not)
			System.out.println("value of a after negation:"+ ~a);//-3 (minus of total positive value which starts from 0)  
			System.out.println("value of b after negation:"+ ~b);//-5 (minus of total positive value which starts from 0)  
			
			//bitwise AND operator 
			System.out.println("Result of a&b is :"+ (a&b)); //0
			
			//bitwise OR operator 
			System.out.println("Result of a|b is :"+ (a|b)); //6
			
			//bitwise XOR operator ^ 
			System.out.println("Result of a^b is :"+ (a^b)); //6
			
			int no=8;
			System.out.println("Original number:"+no); //8
					
			//Left shifting bytes with 1 position
			no= no << 1; // should be 16.
			// equivalent of multiplication of 2
			System.out.println("value after left shift:"+ no);//16
					
			
			no = -8;
			// right shifting bytes with sign 1 position
			no=no>>1;//should be 16
			//equivalent of division of 2
			System.out.println("value after right shift with sign:"+no);//-4
			
			no = -8;
			// right shifting bytes without sign 1 position
			no=no >>> 1;//should be 16 i.e. 00010000
			//equivalent of division of 2
			System.out.println("value after right shift without sign:"+no);//2147483644
			
			
			
		}
		

	}



