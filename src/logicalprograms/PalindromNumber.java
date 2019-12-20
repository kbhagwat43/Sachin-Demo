package logicalprograms;

import java.util.Scanner;

public class PalindromNumber
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the range:");
		int num= s.nextInt();
		
		int temp=num;
		int rev=0,reminder;
		
		while(num>0)
		{
			reminder= num % 10;
			rev= rev*10+reminder;
			num= num/10;
			//System.out.print(reminder);
		}
		//System.out.println(rev);
		
		  if(temp==rev)
			  System.out.println(rev+" is palimdrom");
		  else
			  System.out.println(rev+" Not palimdrom");
		 
		
		
	}

}
