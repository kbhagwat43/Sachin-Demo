package importantPrograms;
// WAP for Armstrong Number.
import java.util.Scanner;
public class ArmstrongNumber 
{
	public static void main(String args[])
	{
		int num;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		int t1=num;
		int length=0;
		while(t1 != 0)	// loop will find out length of number
		{
			length = length+1;
			t1=t1/10;
		}
		
		int rem,arm=0;
		int t2=num;
		
		while(t2 != 0)
		{
			rem= t2%10;		// getting reminder
			int mul=1;
			for(int i=1;i<=length;i++)	//for loop will run length times
			{
				
				mul= mul*rem;
				
			}
			arm=arm+mul;	//multiply result will stored into arm variable
			t2=t2/10;	
		
			
		}
		if(arm==num)
		{
			System.out.println(num+ " is a armstrong number.");
		}
		else
		{
			System.out.println(num+ " is not a armstrong number.");
		}
		
	}

}
