package importantPrograms;
//Program to reverse a number.
import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String args[])
	{
		int num, rem, rev=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number to reverse:");
		num=obj.nextInt();
		
		while(num != 0)		//loop will continue unless number is equal to 0
		{
			rem= num%10;	
			rev= rev*10+rem;	
			num=num/10;
		}
		System.out.println("Reverse number is :"+rev);
	}

}
