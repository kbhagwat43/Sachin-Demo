package logicalprograms;

public class GreaterNumberFromArray {

	public static void main(String[] args) {
		
		int []arr= {2,64,123,7,4,79};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println("Maximum element in array:"+max);

	}

}
