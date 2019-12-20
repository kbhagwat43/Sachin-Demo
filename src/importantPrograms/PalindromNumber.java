package importantPrograms;
//WAP to  illustrate the palindrom number(Reverse of given no is palindrom e.g 121).
import java.util.Scanner;
public class PalindromNumber
{
	public static void main(String args[])
	{
		int num,rem,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		num=s.nextInt();
		int temp=num;
		while(temp != 0)
		{
			rem=temp %10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println(num+ " is a palindrom number.");
		}
		else
		{
			System.out.println(num+" is not a palindrom number");
		}
	}
	

}
