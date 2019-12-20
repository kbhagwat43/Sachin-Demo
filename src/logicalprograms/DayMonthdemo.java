package logicalprograms;

import java.util.Scanner;

public class DayMonthdemo {

	public static void main(String[] args)
	{
		//int num=Integer.parseInt(args[0]);// for command line input
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number");
		int num=s.nextInt();
		
		int days= num%30;
		int month= num/30;
		
		System.out.println(num+"days= "+month+" Month and "+days+" days");
	
		
	}

}
