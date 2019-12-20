package importantPrograms;

public class ArrayWithoutDuplicateEntries {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,3,4,5,6};
		
		int l= arr.length;
		for(int i=0;i<l;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[j]);
			}
			System.out.println(" ");
		}

	}

}
