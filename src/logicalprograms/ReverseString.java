package logicalprograms;
//Program to reverse a String.
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		//String name="Sachin";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any string..");
		String name= sc.nextLine();
		int lenght=name.length();
		String rev="";
		int a=name.length();
		for(int i=a-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Revverse String is="+rev);
	}

}
