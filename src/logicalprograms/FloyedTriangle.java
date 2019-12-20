package logicalprograms;
//WAP to print Floyed's Triangle
import java.util.Scanner;
public class FloyedTriangle 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int num=1, n;
		System.out.println("Enter the numbers of row.");
		n= s.nextInt();		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				  System.out.print(" "+num);
				  num++;
				 
				//System.out.print("*");
			}
			System.out.println();
		}

	}

}
