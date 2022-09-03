package oopExam;

/*
 NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. 
 Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. Implement that here.
 */

public class Iphone2 extends Iphone1 {

	/*
	 * 1) In IPhone2, Initialize a char variable userOfIphone2 (M or F). create
	 * default and parameterized constructor, a void type method iPhone2Info, a
	 * parameterized method with same name iPhone2Info inside Iphone2 class. Use the
	 * super method and super keyword in constructor, and super keyword in methods
	 * of Iphone2. Call constructor and methods. Can you call variable by super
	 * keyword? create a public variable inside Iphone1 and execute it in Iphone2.
	 * Execute all of them in TestPhone. [points: 70]
	 */

	public char userOfIphone2 = 'M';

	public Iphone2() {
		super();
		System.out.println("This is a default constructor from Iphone 2.");
		super.regularClassInfo(); // calling method from super class
		super.youTube(); // calling static method from super class
	}

	public Iphone2(char userOfIphone2) {
		// super();		 //calling the default constructor of parent class
		super(750, "iphone14", 'M', true); 		// calling the parameterized constructor of parent class.
		super.regularClassInfo();
		super.youTube();
		this.userOfIphone2 = userOfIphone2;
		System.out.println("The user of this cell is: " + userOfIphone2);
	}

	public void iphone2Info(char userOfIphone2) {
		System.out.println("Printout the Iphone2 Info");

	}

	/*
	 * Write a method inside them related to one of the features like dropbox and
	 * print out related info.
	 */

}
