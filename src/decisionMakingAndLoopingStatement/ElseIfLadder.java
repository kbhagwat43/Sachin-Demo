package decisionMakingAndLoopingStatement;
//Demonstration of else if ladder.
public class ElseIfLadder
{
	public static void main(String args[])
	{
		int rollNumber[] = {111,222,333,444,555};
		int marks[] = {81,97,43,56,68};
		
		for(int i = 0;i < rollNumber.length; i++)
		{
			if(marks[i]>80)
				System.out.println(rollNumber[i] +" Honours");
			else if (marks[i]>60)
				System.out.println(rollNumber[i] +" 1st Division");
			else if (marks[i]>49)
				System.out.println(rollNumber[i] +" 2nd Division");
			else
				System.out.println(rollNumber[i] +" FAIL");
			
		}
	}

}
