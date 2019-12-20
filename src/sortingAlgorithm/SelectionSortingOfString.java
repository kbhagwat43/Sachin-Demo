package sortingAlgorithm;
public class SelectionSortingOfString 
{
	public static void main(String args[])
	{
		String [] a= {"sachin","maya","raj","rock","roman"};
		int index;
		String temp="";
		for(int i = 0;i< a.length;i++)
		{
			index=i;		//to safe index of i
			for(int j= i+1;j<a.length;j++)	//j=i+1  -j stating from 1st index.
			{
				if(a[j].compareTo(a[index])>0)	
				{
					index=j;	// index positioning is changed.
				}
			}
			temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		
		
		System.out.print("The sorted string is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
