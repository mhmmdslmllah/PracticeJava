package arrayPractice;

public class Array {

	public static void main(String[] args) {

		int i[] = new int[5];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;

		// Index couldn't be negative value in Array never
		// we can never have -index in array
		System.out.println(i[3]);
		System.out.println(i[4]);
		System.out.println(i[0] + i[2]); // addition

		int len = i.length; // It will give us the length of the Array
		System.out.println("Lenght of an array: " + len);
		System.out.println("Hi = " + (len - 1));
		System.out.println("Li = " + 0);
		System.out.println(i[5]); // ArrayIndexOutOfBoundsException: 5

		// print all the values from an array
		// for loop
		for (int k = 0; k < len; k++) {
			System.out.println(i[k]);
		}

		String j[] = new String[3];

		j[0] = "saleem";
		j[1] = "naveen";
		j[2] = "naeem";

		// using for each loop
		// compiler itself take cares of the index
	
		for (String e : j) {
			System.out.println(e);	//enhanced for loop
			//
			System.out.println(j.length);
		}

	}

}
