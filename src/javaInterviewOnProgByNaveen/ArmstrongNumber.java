package javaInterviewOnProgByNaveen;

public class ArmstrongNumber {

	// 153 = cube of every digit and its sum is equal to that num. 1*1*1+5*5*5+3*3*3=1+125+27=153
	public static void isArmstrongNumber(int num) {
		
		int rem =0;
		int sum = 0;
		int temp= num;
		while(num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num /10;
		}
		
		if(temp == sum) {
			System.out.println(temp+" is Armstrong number.");
		}else
		{
			System.out.println(temp+" is not Armstrong number.");
		}
		
	}
	
	
	public static void main(String[] args) {

		isArmstrongNumber(153);
		isArmstrongNumber(123);
	}

}
