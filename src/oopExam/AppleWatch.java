package oopExam;

/*
 write inside multiple line comments what you know about Abstract class
Here, Can you make a relationship of AppleWatch with Watch, DigitalWatch, and AppleWatchSeries5? [points: 70] . 
 */
/*Yes! we can create a relationship between AppleWatch with Watch because Abstract class can implements an interface by implements keyword. 
 * Abstract class can extends a regular class also by extends keyword.
 * 
 */
public abstract class AppleWatch implements Watch {
	/*
	 * Can you create a variable and constructor inside Abstract Class? Can you
	 * instantiate it?
	 */
	/*
	 * We can not create a constructor in an abstract class but we can instantiate
	 * an abstract class. Because in abstract class some methods are implemented and
	 * some them are not implemented.
	 */
	/*
	 * Create 2 method: One is abstractClassInfo [which is a non-abstract method,
	 * print out all the features of an abstract class compared with Interface,
	 * regular class]. what type of method would be the other one if the name is
	 * appleWatchInfo? Please create this method
	 */

	public void abstractionClassInfo() {
		System.out.println(
				"This is a abstarction class info method from abstraction class. in abstract class we can create a variable. "
						+ "We can not create a an object of an abstract class. If we compare an abstract class with an Interface we can not create any constructor neither an object of interface."
						+ "If we compare an abstract class with regular class then a regular class become concrete class becouse it helps to instantiate an abtract class and interface. ");
	}

}
