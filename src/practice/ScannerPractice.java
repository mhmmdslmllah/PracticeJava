package practice;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ScannerPractice {

	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number please!");
//		int number = sc.nextInt();
//		System.out.println("Thank you.");
//		sc.close();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Name");
		String name = sc.nextLine();
		System.out.println("welcome to scanner. Now put your age " + name);
		int age = sc.nextInt();
		System.out.println("Thank you for entering the information. Are you a citizen?");
		boolean citizen = sc.nextBoolean();	
		System.out.println("you can cast a vote:-)" );
		sc.close();
		
		
		
		

	}
}
