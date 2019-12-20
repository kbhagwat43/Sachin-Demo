package sortingAlgorithm;
public class bubbleSortingOfString1 
{
	public static void main(String args[])
	{
		String []a= {"Sachin","Smita","Bharat","Baby","Janvhi","Rajendra"};
		String temp;
		
		System.out.println("String before bubble sorting:");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}

			}
		}
		System.out.println();
		System.out.println("String after bubble sorting:");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
	}

}
