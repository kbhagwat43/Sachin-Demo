package logicalprograms;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num=1234;
		int reminder;
		int reverse=0;
		
		while(num>0)
		{
			reminder = num % 10;//4
			reverse= reverse*10+reminder;
			num=num/10;
		}
		
		System.out.println("Reverse number is:"+reverse);
		
	}
}
