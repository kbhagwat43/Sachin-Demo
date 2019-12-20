package logicalprograms;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int num=153;
		int temp=0;
		int flag=num;
		
		int mul=0;
		
		while(num !=0)
		{
			temp= num % 10;
			mul= mul + (temp*temp*temp);
			num= num/10;
			//System.out.println(mul);
		}
		//System.out.println(temp);
		if(flag==mul)
			System.out.println(mul+" is armstrong number");
		else
			System.out.println(mul+" is not armstrong number");
		
		
		
	}

}
