package importantPrograms;
//WAP to illustrate the entered number is even or odd number.
import java.util.Scanner;
public class EvenOddNumber
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num= s.nextInt();
		
		if((num % 2) == 0)	//Decide even or odd
			{
			   System.out.println(num+ " is even number.");
			}
			else
			{
				System.out.println(num+ " is odd number.");
			}
		
		}
		
}


