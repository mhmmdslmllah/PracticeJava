package nestedClass;

public class Outter_Class {
	
	int a = 100;
	int b = 50;
	

	public void outter_Class() {
	System.out.println("Hi! This is greeting from Outter_Class.");
	}
	
	public class Inner_Class{
		
		int c = 20;
		int d = 30;
		
		public void inner_Class() {
			System.out.println("Hello! This grteeting id from the Inner_Class.");
		}
	}
}
