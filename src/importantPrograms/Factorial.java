package importantPrograms;
//WAP to calculate factorial of a number.
import java.util.Scanner;

public class Factorial 
{
	public static void main(String args[])
	{
		int num, fact=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number,you wanna factorial..");
		num=s.nextInt();
		
		for(int i=num;i>=1;i--)
		{
			fact = fact * i;
			//fact *= i;
		}
		
		System.out.println("Factorial of "+num+" is "+fact);
		
	}

}

/*
 // Another simple logic for factorial
  	class Factorial
  	{
  		public static void main(String args[])
  		{
  		int fact=1;
  		for(int num =5;num>=1;num--)
  		{
  			fact *= num; 	
  		}
  		System.out.println("Factorial of 5 is "+fact);
  		}
  	}
 
*/