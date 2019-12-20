package javaInterviewOnProgByNaveen;

public class MissingNumberInArray {

	public static void main(String[] args) {

		//logic for sequencing order:
		//int a[] ={1,2,4,5};
		//1+2+4+5=12
		//1+2+3+4+5=15
		//15-12=3 is missing number
		
		int a[] = {1,2,4,5};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum= sum + a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for (int j = 1; j <= 5; j++) {
			sum1= sum1 + j;
		}
		
		System.out.println(sum1);
		
		System.out.println("Missing Number in Array::"+(sum1-sum));
	}

}
