package javaInterviewOnProgByNaveen;

public class FactorialNumber {

	//1: without recursive function - use for loop
	public static void factorialNumber(int num) {
		int fact =1;
//		while(num >0) {
//			fact = fact * num;
//			num = num - 1;
//		}
		
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			
		}
		System.out.println("Factorial of num is:"+fact);
	}
	
	//2: with recursive function(function calling itself is called recursion)
	public static int fact(int num) {
		
		if(num == 0) {
			return 1;
		}
		return  (num * fact(num -1));
	}

	public static void main(String[] args) {
		factorialNumber(3);
		System.out.println("Factorization is :"+fact(5));
	}
}
