package importantPrograms;
//Program for fibonacci Series taking input/range from user.

import java.util.Scanner;


public class FibonacciSeries1
{
	public static void main(String args[])
	{
		int a =0, b =1, sum=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the range:");
		int num =scn.nextInt();
		System.out.print(a+" "+b);
		while(sum< num-1)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum+" ");
		}
		
		
		
		
	}

}
