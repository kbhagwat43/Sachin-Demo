package logicalprograms;
import java.util.Scanner;
public class FahrenheitToCelsious {

	public static void main(String[] args) 
	{
		float temperatue;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a temperatue..");
		temperatue=sc.nextInt();
		
		temperatue = ((temperatue-32)*5)/9;
		
		System.out.println("Temperatue in celsious is= "+temperatue);
		

	}

}
