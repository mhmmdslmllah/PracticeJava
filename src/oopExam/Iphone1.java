package oopExam;

/*
1)  Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]. [points: 30] . 

 */

public class Iphone1 implements Phone{

	/*
	 * 2) Assume 4 private variables here -- price (as int), Info (as String), user
	 * (as a char, M or F), madeInUSA (as boolean) inside Iphone1 class. If the
	 * variables are private how can you use those variable? What kind of concept
	 * you can use? use it just after the variables. get the out come in TestPhone
	 * class. Complete this action and go to next.
	 */
	private int priceIphone;
	private String modelName;
	private char user;
	private boolean madeInUSA;

	public int getPriceIphone() {
		return priceIphone;
	}

	public void setPriceIphone(int priceIphone) {
		this.priceIphone = priceIphone;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	/*
	 * 3) Again, here in Iphone1, we got 4 private variables we know. Create 2
	 * constructors inside it using that 4 private variables -- default and
	 * parameterized after those variables (obviously before methods and after
	 * variables), now go to Iphone2 class.
	 */
	public Iphone1() {
		System.out.println("Default constructor from Iphone1");

	}

	public Iphone1(int priceIphone, String modelName, char user, boolean madeInUSA) {

		this.priceIphone = priceIphone;
		this.modelName = modelName;
		this.user = user;
		this.madeInUSA = madeInUSA;
		System.out.println("Price of Iphone is: " + priceIphone + "Model is: " + modelName + "User is :" + user
				+ "Made In : " + madeInUSA);
	}

	/*
	 * 1) Create a method - regularClassInfo and print out all the features of a
	 * regular class compared with Interface and Abstract class you know.
	 */
	public void regularClassInfo() {
		System.out.println("this is a regular class info method from regular class ");
	}

	public static void youTube() {
		System.out.println("This is a static method from regular class.");

	}
	/*
	 * we can not have a default method here because it is only allow in Interface.
	 * 
	 * public void default internetExplorer() {
	 * 
	 * }
	 */
	/*
	 * Write a method inside them related to one of the features like youtube and
	 * print out related info.
	 */

	@Override
	public void pagerMethod1() {
		System.out.println("This method is ipmlemetning from pager Interface");
		
	}

	@Override
	public void pagerMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WakitokiMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WakitokiMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}

}
