package sortingAlgorithm;
//Program for INSERTION SORT by taking input from user.
/*
 * Insertion sort is a simple sorting algorithm in which smallest element of list is getting
 * Choose and place it to its appropriate position in ascending or descending order. 
 * (like a playing cards.)
 */

import java.util.Scanner;

public class InsertionSort
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many element you want to enter the list..");
		int num=s.nextInt();
		int []a= new int[num];
		
		System.out.println("Enter elements in the list:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Enterd List is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		//int []a= {5,1,6,2,4,3};
		int temp;
		int j;
		
		for(int i= 1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
			
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		
		System.out.println();
		System.out.println("Sorted list is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
