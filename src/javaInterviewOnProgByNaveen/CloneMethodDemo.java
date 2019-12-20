package javaInterviewOnProgByNaveen;
/**
 * 
 * @author SACHU
 * 
 * 
 * Cloneable is marker interface in java which does not contain any fields and methods.
 * clone() method of Object class in not visible or available to outside the class.If we want to use clone() method of object class
 * then we have to implement the Cloneable interface otherwise it won't be clone and throws runtime exception i.e. CloneNotSupportedException.
 * In that particular class, we have to override the clone() method for Object class as follows.
 * 
 * cloning--- creation of exact clone of an existing object is called cloning.
 * There are 3 types of cloning 
 * 1.Shallow cloning-only fields of primitive data type will be clone and object reference will not.
 * 2.Deep cloning -- Both fields of primitive data type and object reference will be clone.
 * 3.Lazy cloning --- This is a combination of both shallow and deep cloning.
 *
 */

public class CloneMethodDemo implements Cloneable{

	int a;
	String s;

	public CloneMethodDemo(int a, String s) {

		this.a = a;
		this.s = s;

	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		CloneMethodDemo c = new CloneMethodDemo(20, "Sachin");

		CloneMethodDemo d = (CloneMethodDemo) c.clone();
		
		System.out.println(d.a+" "+d.s);

	}

}
