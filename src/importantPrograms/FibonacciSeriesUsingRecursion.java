package importantPrograms;
//WAP to print fibonacci Series using recursion.
public class FibonacciSeriesUsingRecursion 
{
	static int a=0,b=1,c;  // static variables declared.
	public static void main(String args[])
	{
		
		FibonacciSeriesUsingRecursion ob= new FibonacciSeriesUsingRecursion();//object created to call printFib()
		ob.printFib(10);//method call using obj
		System.out.print(a+ " "+b);
		
	}


	void printFib(int i)
		{
			if(i>=1)
				{ 
					c=a+b;
					System.out.print(" "+c+" ");
					a=b;
					b=c;
					printFib(i-1);//decrementing i by 1
				}
		}
}