package logicalprograms;

public class OddAndEvenFromArray {

	public static void main(String[] args) {

	int [] arr= new int[] {1,2,3,4,5,6};
	
	System.out.println("The even number in array:");
	for(int i=1;i<arr.length;i+=2)
	{
		System.out.println(arr[i]);
	}
	
	System.out.println("The odd number in array:");
	for(int i=0;i<arr.length;i+=2)
	{
		System.out.println(arr[i]);
	}
	

	}

}
