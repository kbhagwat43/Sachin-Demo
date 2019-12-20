package javaInterviewOnProgByNaveen;

import java.util.Arrays;

public class LargestAndSmallestIntegerFromArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 ,55,4,3,6,7,0};

		int LargestNum = arr[0];
		int SmallestNum = arr[0];
		
		int len = arr.length;

		//Time Complexity : O(n) --because we have only one for loop.
		for (int i = 0; i < len; i++) {

			if (arr[i] > LargestNum) {
				LargestNum = arr[i];
			}else if (arr[i] < SmallestNum) {
				
				SmallestNum = arr[i];
				
			}
		}

		System.out.println("Given Array is::"+ Arrays.toString(arr));
		System.out.println("Lagest number is::" + LargestNum);
		System.out.println("Smallest Number is::" + SmallestNum);

	}

}
