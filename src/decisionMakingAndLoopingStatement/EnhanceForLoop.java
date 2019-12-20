package decisionMakingAndLoopingStatement;
// for(datatype identifier: array_variable)
//i.e. for(int i : arr)
import java.util.*;
public class EnhanceForLoop
{
	public static void main(String args[])
	{
		System.out.println();
		String states[] = {"Maharashtra","Andrapradesh","Gujrat","Rajestan"};
		
		for(int i =0; i < states.length ; i++)
		{
			System.out.println("Standard For loop: States name :" + states[i]);
		}
		System.out.println();
		
		for(String i : states)
		{
			System.out.println("Enhanced for-loop : states name :" + i);
			
		}
		
		System.out.println();
		
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("karanja");
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Nagpur");
		System.out.println();
		for(int i=0;i< cities.size();i++)
		{
			System.out.println("Standard for-loop : city name: "+ cities.get(i));
		}
		System.out.println();
		for(String city: cities)
		{
			System.out.println("Enhanced for-loop: city name : "+ city);
		}
		System.out.println();
		System.out.println("In Collections");
		System.out.println();
		printCollection(cities);
		
	}
	public static<AnyType> void printCollection(Collection<AnyType> c)
	{
		for(AnyType val: c)
			System.out.println(val);
	}

}
