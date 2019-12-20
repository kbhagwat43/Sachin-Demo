package arrayInJava;

import java.util.Scanner;

public class UserInputInArray {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of values you want..");
		int length=s.nextInt();
		
		int[] arr= new int[length];
		
		System.out.println("Enter values");
		
		for(int i= 0; i< arr.length;i++)
		{
			
			arr[i]=s.nextInt();
		}
		
		System.out.println("You have entered the value:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
}
