package oopExam;

/*
In 2004, Iphone6 come into the market which inherits Iphone5. Implement it. 
*/
public class Iphone6 extends Iphone5{
	/*
	 * Write a method inside them related to one of the features like compass and
	 * print out related info. 
	 * 
	 * What kind of concept you can use to relate to Iphone1 to 6? Instantiate Iphone6 in TestPhone and show how many methods they can
	 * call in TestPhone. [points: 70] . 
	 * 
	 */
	public void iphone6Compass() {
		System.out.println("This is a compass method from iphone 6.");
	}
	
	public void screenSizeIphone6() {
		System.out.println("The screen size of iphone 6 was 6.5 and 1080 resolution.");
	}

	/* First write about method over loading and method overriding with multiple line comments here
	 * Now, Think about Iphone6. It also has 6 methods with the same name as
	 * materials(). For example -- They are return type parameterized method (int ramPrice, int
	 * cameraPrice), another one return type parameterized method (int ramPrice, int cameraPrice, String
	 * ProcessorPrice), etc. Can you use the void, parameterized(return type), final (return type), or static (return type)
	 * method here as the same method name? if yes, create them and take more int
	 * variable of your own. What kind of concept you can use? [points: 70].
	 * Instantiate the class in TestPhone and initialize those methods. [points:
	 * 70]. 
	 * Now think about a regular class Name ConfiguredIphone6 which extends
	 * Iphone6. Override those methods of Iphone6 and change the logic at your own to show the
	 * changes. [points: 50]. Show the output in TestPhone (how many methods is
	 * possible to extends). [points: 50]. 
	 * 
	 * Please make sure you organize the code in every class
	 * 
	 * Paste the github link for the package
	 * below
	 * 
	 */
	/*Method overloading: is also called early binding or compile/static time polymorphism. In compile time polymorphsim the methods are are overloaded
	 * which means that the name of the methods are same but the parameters are different. Overloading happens within the class.
	 * 
	 * Method overriding: It's also called late binding or Dynamic/runtime  polymorphism in which the name of them methods are same and the parameters are also
	 * same. In method overriding the logic is different of them methods. Overriding is done between parent class and child class.
	 * 
	 */
}
