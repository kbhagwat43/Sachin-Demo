package logicalprograms;

public class AvarageOfElementsOfArray {

	public static void main(String[] args) {
		
		double []arr= new double[] {2.5,6.5,7.6,7.4,3.5};
		double sum=0f;
		double avg=0.0f;
		
		for(double i : arr)
		{
			sum= sum+i;
			
		}
		
		avg= sum/arr.length;
		
		System.out.println("Sum of elements of array is>>"+sum);
		System.out.println("Avarage of elements of array is>>"+avg);
		
		

	}

}
