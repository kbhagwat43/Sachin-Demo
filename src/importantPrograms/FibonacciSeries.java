package importantPrograms;
//program to write Fibonacci Series

public class FibonacciSeries 
{
	public static void main(String args[])
	{
		int a=0, b=1, c;
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		
		while(c<50)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
	}

}

