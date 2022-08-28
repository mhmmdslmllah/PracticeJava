package nestedClass;

import nestedClass.Outter_Class.Inner_Class;

public class Main_Class {

	public static void main(String[] args) {
   
		
		Outter_Class outter = new Outter_Class();
		outter.outter_Class();
		
		Outter_Class.Inner_Class inner =Inner_Class();
		inner.inner_Class();
		
			
	}

}
