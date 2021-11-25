package test.day3.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("John", 25,"23 East, California");
		student.setX(10);
		String filename = "C:\\Users\\phurb\\OneDrive\\Desktop\\Java\\Test.txt";
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		
		//Serialization
		try {
			fileOut = new FileOutputStream(filename);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(student);
			
			objOut.close();
			fileOut.close();
			
			System.out.println("Object has been serialize: \n" + student);
		} catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		
		//Deserialization
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		
		try {
			fileIn = new FileInputStream(filename);
			objIn = new ObjectInputStream(fileIn);
			
			Student object = (Student) objIn.readObject();
			System.out.println("Object has been deserialized: \n "+ object);
			System.out.println("deserialized val: "+object.getX());
			
			objIn.close();
			fileIn.close();
		}catch (IOException ex) {
			System.out.println("IOException is caught");
			
		}catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException"+ " is caught");
		}
	}

}
