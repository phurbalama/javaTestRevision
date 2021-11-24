package test.day3.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
	//using throws keyword
	public static void main(String[] args) throws MyException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("C:\\test\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		//prints first 3 lines of file
		for (int counter = 0; counter< 3; counter++)
			System.out.println(fileInput.readLine());
		
		fileInput.close();
		//custom exception
		throw new MyException();
	}

}
