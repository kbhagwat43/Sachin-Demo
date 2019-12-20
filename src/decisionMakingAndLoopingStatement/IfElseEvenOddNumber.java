//WAP to counts the even and odd numbers in a list of a numbers using if...else statement.
package decisionMakingAndLoopingStatement;
public class IfElseEvenOddNumber
{
	public static void main(String args[])
	{
		int arr[]= {55,76,89,90,54,32};
		int even=0, odd=0;
		
		for(int i=0;i < arr.length;i++)
		{
			if((arr[i] % 2) == 0)	//Decide even or odd
			{
				even += 1;	// counting even numbers
			}
			else
			{
				odd += 1;	// counting odd numbers
			}
		
		}
		
		System.out.println("Even numbers:"+ even + " Odd numbers:" + odd);
		
	}

}
