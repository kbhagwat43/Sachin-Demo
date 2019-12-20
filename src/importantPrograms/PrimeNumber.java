package importantPrograms;
//WAP to illustrate enter number is Prime Number(no. divided by 1 or itself is prime number e.g 7)
import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any number:");
		int num= s.nextInt();
		int temp =0;
		for(int i=2;i<num;i++)
		{
			if (num%i==0)
				{
					temp=1;
					break;
				}
			
		}
		if (temp==0)
		{
			System.out.println(num+" is prime number.");
		}
		else
		{
			System.out.println(num+" is not prime number.");
		}
	}

}
