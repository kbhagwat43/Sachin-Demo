package logicalprograms;

public class BooleanOperator {

	public static void main(String[] args)
	{
		boolean A= true;
		boolean B= false;
		
		System.out.println("A|B="+(A|B));//true
		System.out.println("A&B="+(A&B));//false
		System.out.println("!A="+(!A));//false
		System.out.println("A^B="+(A^B));//true
		System.out.println("(A|B)&A="+((A|B)&A));//true

	}

}
