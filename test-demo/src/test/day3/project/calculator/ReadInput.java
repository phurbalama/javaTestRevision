package test.day3.project.calculator;

import java.util.Scanner;

//this class reads user input and returns the string using a read method
public class ReadInput {

	public static String read() {
		
		//Scanner class allows input functionality from user
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input expression (for eg: 4*3/2)");
		
		String inputLine = scanner.nextLine();
		
		scanner.close();
	
		return inputLine;
		
	}
}
