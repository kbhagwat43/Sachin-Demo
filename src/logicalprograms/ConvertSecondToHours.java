package logicalprograms;
//WAP to convert Second to hours,minute and second.
import java.util.Scanner;

public class ConvertSecondToHours {

	public static void main(String[] args) 
	{
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the numbers.");
		int input= s.nextInt();
		
		
		int hours= input/3600;
		int min= (input%3600)/60;
		int sec= (input%3600)%60;
	
		
		System.out.println("Hours="+hours);
		System.out.println("Minute="+min);
		System.out.println("Second="+sec);
		
		//to print copyright symbol in java.
		System.out.println("copyright \u00a9 2014");
		
		
	}

}
