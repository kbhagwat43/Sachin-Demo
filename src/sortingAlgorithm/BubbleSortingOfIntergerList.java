package sortingAlgorithm;
public class BubbleSortingOfIntergerList 
{
	public static void main(String args[])
	{
		int [] arr= {36,19,29,12,5};
		int temp=0;
		for(int i=0;i<arr.length;i++)	// for round= no.of elements -1
		{
			int flag=0;
			
			//for(int j=0;j<arr.length-1;j++)  // for comparing adjacent elements 
			
			for(int j=0; j<arr.length-1-i ;j++)	//i =don't swap if the greater element place at last in each round 
			{
				if(arr[j]>arr[j+1])		// if 1st is greater then 2nd element
				{
					temp=arr[j];		//swapping logic for elements
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;				//elements is getting sorted once it is sorted then flat will be 0.
				}
			}
			if(flag==0)
			{
				break;
			}
			
		}
		for (int i=0;i<arr.length;i++)		// to print the sorted list
		{
			System.out.print(arr[i]+" ");
		}
	}

}
