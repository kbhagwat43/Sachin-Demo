package sortingAlgorithm;
//program to illustrate selection sort algorithm.
/*
 * Selection sort-It is the combination of searching and sorting process in which 
 * it searches for the lowest element in the list and then replace/swap it to its appropriate
 * position.
 */
public class SelectionSortingOfInteger 
{
	
	public static void main(String args[])
	{
		int [] a= {38,52,9,18,6,62,13};
		int index,temp=0;
		for(int i = 0;i< a.length;i++)
		{
			index=i;		//to safe index of i
			for(int j= i+1;j<a.length;j++)	//j=i+1  -j stating from 1st index.
			{
				if(a[j]<a[index])	
				{
					index=j;	// index positioning is changed.
				}
			}
			temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		
		
		System.out.print("The sorted list is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
