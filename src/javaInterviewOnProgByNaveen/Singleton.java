package javaInterviewOnProgByNaveen;

public class Singleton {

	/**
	 * In OOP,Singleton class is a class that can have only one object(instance of the class) at a time. 
	 * How to design singleton class:
	 * 1.Make constructor of class private.
	 * 2.write a static method(getInstance) that has return type of Object of this singleton class.(This is also called Lazy Initialization).
	 * 
	 * Diff.Bet normal class and Singleton class:
	 * for normal class,we use constructor whereas for singleton class,we use getInstance() method ( which is static in nature) for instantiation.
	 * 
	 */

	private static Singleton singleton_instance = null;
	
	private String str;
	
	//private constructor
	private Singleton() {
		str = "Hey I am using singleton class pattern";
	}
	
	//Static method which return object of class.
	public static Singleton getInstance() {
		if(singleton_instance == null)
			singleton_instance = new Singleton();//if singleton_instance is null then only create new object otherwise return same object.
		return singleton_instance;
	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = x.str.toUpperCase();
		
		System.out.println(x.str);//HEY I AM USING SINGLETON CLASS PATTERN
		System.out.println(y.str);//HEY I AM USING SINGLETON CLASS PATTERN
		System.out.println(z.str);//HEY I AM USING SINGLETON CLASS PATTERN
		
		z.str= z.str.toLowerCase();

		System.out.println(x.str);//hey i am using singleton class pattern
		System.out.println(y.str);//hey i am using singleton class pattern
		System.out.println(z.str);//hey i am using singleton class pattern
	}

}
