package javaInterviewOnProgByNaveen;

public class FactoryDesignPattern {

	public static void main(String[] args) {

		Vehical v1 = Vehical.getAnyVehical("Cars");
		Vehical v2 = Vehical.getAnyVehical("Bike");
		Vehical v3 = Vehical.getAnyVehical("Train");

	}

}

class Vehical {
	// factory design pattern
	/**
	 * When we have super class with multiple sub-classes and on the basis of input,it will return the subclass.
	 * This type of design pattern is called as "Factory design pattern".
	 * It is responsibility of factory design pattern to instantiate the object of subclass while providing input at runtime
	 *
	 * @param str
	 * @return
	 */
	static Vehical getAnyVehical(String str) {
		if (str.equals("Cars")) {
			return new Cars();
		} else if (str.equals("Bike")) {
			return new Bike();
		} else if (str.equals("Train")) {
			return new Train();

		}
		return null;
	}

}

class Cars extends Vehical {

	public Cars() {
		System.out.println("am in cars");
	}

}

class Bike extends Vehical {

	public Bike() {
		System.out.println("am in bike");
	}

}

class Train extends Vehical {
	public Train() {
		System.out.println("am in train");
	}
}