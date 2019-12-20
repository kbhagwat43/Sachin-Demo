package logicalprograms;
//swapping of two numbers without using third variable.
public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10,b=20;
		
		System.out.println("before Swapping:"+ a+ " "+b);
		
		/*
		 * b=a+b;//30 
		 * a=b-a;//30-10=20
		 *  b=b-a;//10
		 */
		
		a= a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("After Swapping:"+ a+ " "+b);
		

	}

}
