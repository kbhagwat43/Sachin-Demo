package logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the range:");
		int num= s.nextInt();
		
		int n1=0,n2=1;
		
		System.out.print(n1+" "+n2);
		
		int temp=0;
		while(temp < num)
			
		{
			temp= n1+n2;
			n1=n2;
			n2= temp;
			if(temp< num)
			{
				System.out.print(" "+temp);
			}
			
		}
		
		
	

	}

}
