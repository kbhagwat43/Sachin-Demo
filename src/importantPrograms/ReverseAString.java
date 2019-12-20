package importantPrograms;
//WAP to illustrate Reverse a entered String.
import java.util.Scanner;
public class ReverseAString
{
	public static void main(String args[])
	{
		//String name="SACHIN";
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any String/name:");
		String name=s.nextLine();
		
		
		int leng=name.length(); //name.length() gives length of string
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i); //name.charAt(i) gives character at index.
		}
		System.out.println("Reverse of "+name+" is:"+rev);
		
	}

}
