package logicalprograms;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num= s.nextInt();
		int fact=1;
		for(int i= num; i>=1; i--)
		{
			fact= fact*i;
		}
		
		System.out.println("Factorial of the number is="+fact);

	}

}
