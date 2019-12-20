package decisionMakingAndLoopingStatement;
public class TriangleUsingForLoop
{
	public static void main(String agrs[])
	{
		int p,q;
		System.out.println("The right angle triangle of @ is shown below:\n");
		for(p = 1; p <= 9; p++)
		{
			for(q = 1; q <= p; q++ )
			{
				System.out.print("@");
			}
			System.out.println("  ");
		}
	}

}
