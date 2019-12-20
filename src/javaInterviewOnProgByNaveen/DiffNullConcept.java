package javaInterviewOnProgByNaveen;

public class DiffNullConcept {

	static Object obj; //object class reference
	static String sobj;//default class reference
	static DiffNullConcept nc; // Custom class reference.
	
	
	public static void main(String[] args) {

		//null is keyword hence it is case sensitive.
//		String s = Null;
//		String s1= NULL;
		String s2 = null; //Okay
		
		//1.Default value of any class reference is null
//		System.out.println(obj);
//		System.out.println(sobj);
//		System.out.println(nc);
		
		
		/**
		 * 2.while doing autoboxing/typecasting/upcasting
		 * We can't assign null value to any permeative DataType.
		 * if we are trying to assign then it will give us NullPointerException.
		 */
		Integer i = null;
//		int j = i;
//		System.out.println(j); //NullPointerException
		
		
		/**
		 * 3.instanceof keyword
		 * Although i is reference of Integer class but it is currently pointing to null object value.
		 * thats why it is not reference of the Integer class.
		 * When we assigning any value to the reference variable then only it will treated as reference of that
		 * particular class. 
		 */
		
		Integer i1 = null;
		Integer j1 = 10;
		System.out.println(i1 instanceof Integer);//false
		System.out.println(j1 instanceof Integer);//true
		
		/**
		 * 4.Static method and non static method
		 * if we are trying to access the non static method before creating the object of class,then it will give us NullPointerException.
		 * But for Static member,it won't be applicable because static member is getting loaded by JVM class loader before initializing the object.
		 * it won't be required to create an object to access it.it store in common memory of jvm memory management.
		 * Static members are class level not object level.
		 * 
		 */
		DiffNullConcept nc = null;
//		nc.send();//NullPointerException --reference nc is pointing to null object.
		nc.sum(); //Sum...
		
		
		/**
		 * 5.default value of String
		 * null can be assign to any wrapper class and can be typecasted to any wrapper class
		 * Don't be confused after getting the output of following statements,
		 * null is type casted to String class,it does not mean that null is become string now.
		 * If we type cast any null value to String class then we can append any string to it.
		 * but we can not perform any string operation on it like s6.length() ,if we do so then it will give us NullPointerException.
		 * 
		 */
		
		String s6 = (String) null;
		System.out.println(s6); //null
		System.out.println(s6 + "sachin");//nullsachin
		System.out.println(s6.length());//NullPointerException
		
		
		
	}
	//static method
	public static void sum() {
		System.out.println("Sum...");
	}
	//non static method
	public void send() {
		System.out.println("Send...");
	}

}

