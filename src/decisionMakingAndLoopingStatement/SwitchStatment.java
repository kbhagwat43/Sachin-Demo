package decisionMakingAndLoopingStatement;
/* Switch statement tests the value of given expression against the list of case value
  and when match is found,a block of statement associated with that case is executed.
*/
public class SwitchStatment 
{
	public static void main(String args[])
	{
		char choice;
		System.out.println("Select your choice");
		System.out.println("M -> Mumbai");
		System.out.println("P -> Pune");
		System.out.println("N -> Nagpur");
		System.out.println("K -> Karanja");
		System.out.println("Choice ----->");
		
		System.out.flush(); // clears the output stream after writing the leftover byte(if any)
		
	try	
		{
		    switch(choice = (char) System.in.read()) //return next  byte of data and throws i/o exception
			{
			case 'M':
			case 'm': System.out.println("Mumbai : Booklet1");
					  break;
			case 'P':
			case 'p': System.out.println("Pune : Booklet 3");
					  break;
			case 'N':
			case 'n': System.out.println("Nagpur : Booklet 5");
					  break;
			case 'K':
			case 'k': System.out.println("Karanja : Booklet 2");
					  break;
		     default: System.out.println("Invalid choice (IC) ");
							
		    }
		}
		catch(Exception e)
		{
			System.out.println(" I/O Error");
		}
		
	}

}
