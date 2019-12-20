package arrayInJava;

import java.util.Scanner;

public class UserInputInArrayString 
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("how many names you want to entered:");
		int length=s.nextInt();
		
		String [] names= new String[length];
		System.out.println("Enter names:");
		for(int i= 0;i< names.length; i++)
		{
			names[i]=s.next();
		}
		
		System.out.println("You friends name is:");
		for(int i=0; i< names.length; i++)
		{
			System.out.println(names[i]+" ");
		}
		
	}

}
