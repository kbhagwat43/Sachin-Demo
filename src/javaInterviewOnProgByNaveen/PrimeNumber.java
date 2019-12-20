package javaInterviewOnProgByNaveen;
public class PrimeNumber {

	public static boolean isPrimeCheck(int num) {	
		//1 and less than 1 is not prime num.prime num will start from 2. 2 is lowest prime number.
		if(num <= 1) {
			return false;
		}

		for(int i =2 ;i<num ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	//to find out prime num under highest range/num
	public static void getPrimeNumbers(int num) {
		System.out.println("Prime number upto:"+num);
		for(int i=2 ; i <= num ;i++) {
			if(isPrimeCheck(i)) {
				System.out.print(i + " ");			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {

		System.out.println("2 is prime number:"+isPrimeCheck(2));//true
		System.out.println("1 is prime number:"+isPrimeCheck(1));//false
		System.out.println("0 is prime number:"+isPrimeCheck(0));//false
		System.out.println("-1 is prime number:"+isPrimeCheck(-1));//false

		getPrimeNumbers(7);
		getPrimeNumbers(20);
		
	}


}
