package oopExam;

/*
 Points: 70

1) What are the features of Interface you know? use multiple line comments here to describe it. you can use newline (\n) and tab(\t)
 
2) if Phone interface, inherit other Interface -- Pager and Wakitoki, use appropriate keywords to inherit them in line 11. 
if Phone interface can inherit regular class - LandPhone and one abstract class SatelitePhone, 
use appropriate keywords to inherit them. if not, then ignore it
 */

public interface Phone extends Pager, Wakitoki {

	/*
	 * 3) Create a variable and a constructor if possible, if not possible to create
	 * variable and constructor, use multiple line comments with explanation
	 */

	public static final String iphoneInventor = "Steve Jobs";

	/*
	 * We can not create a constructor in interface because all the data members in
	 * Interface are public static by default. Because there are no data members in
	 * an Interface to initialize them through the constructors.
	 */

	/*
	 * 4) Create four abstract method interfaceInfo (created below), call, message
	 * and camera
	 */
	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	/*
	 * 5) Create 2 non-abstract method - battery and wireless which are implemented
	 * inside this interface. Inside sysout print example--
	 * "battery is a --- method from Java --?--" and complete the wireless one
	 */
	/*
	 * We know that in interface we can only declare methods. All the declare
	 * methods in interface are naturally abstract means that if you want you can
	 * write abstract in the method. If you don't type abstract in the method it's
	 * still allow because they are abstract in nature. After Java 1.8 version we
	 * can only implement these two methods static and default only.
	 */

	public static void battery() {
		System.out.println("This is a static battery method from Phone Interface.");
	}

	public default void wireless() {
		System.out.println("This is a default type wireless method from Phone Interface.");
	}

}
