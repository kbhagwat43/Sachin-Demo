package logicalprograms;
import java.util.Scanner;
public class LargestNumber
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the three number:");
		int a= s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		
		System.out.println("You have entered..."+a+" ,"+b+" ,"+c);
		
		if(a>b && a>c)
			System.out.println("A:"+a+" is gretter number..");
		

		else if(b>a && b>c)
			System.out.println("B:"+b+" is gretter number..");
		

		if(c>a && c>b)
			System.out.println("C:"+c+" is gretter number..");
	}

}
