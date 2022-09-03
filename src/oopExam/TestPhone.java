package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		/*
		 * Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible
		 * method by each of them. [points: 70] .
		 */
		System.out.println("------------Iphone1 execution starts------------");
		Iphone1 iphone1 = new Iphone1();
		iphone1.setPriceIphone(750);
		iphone1.setModelName("Iphone13");
		iphone1.setUser('M');
		iphone1.setMadeInUSA(false);
		System.out.println("I bought this phone in 2000, the price was $" + iphone1.getPriceIphone() + "\nuser's sex: "
				+ iphone1.getUser() + "\nand boolean value for made in USA is: " + iphone1.getModelName());
		/*
		 * Initialize getter and setter methods here from Iphone 1 and print:
		 * "I bought this phone in 2000, the price was 750$, user's sex: <put your sex initial> and boolean value for made in USA is: false"
		 * . [points: 70] .
		 */

		System.out.println("---------Iphone2 executions start------------");

		Iphone2 iphone2 = new Iphone2();
		iphone2.iphone2Info('M');

		/*
		 * Instantiate Iphone6 in TestPhone and show how many methods they can call in
		 * TestPhone. [points: 70] . Comment out at the end of TestPhone to inform me
		 * which is hierarchical inheritance, multilevel inheritance, and single
		 * inheritance. [points: 50].
		 */

			Iphone6 iphone6 = new Iphone6();
			
	}

}
