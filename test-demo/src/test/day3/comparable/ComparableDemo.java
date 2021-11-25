package test.day3.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student john = new Student(3,"John",21);
		Student jane = new Student(1,"Jane",18);
		Student tom = new Student(2,"Tom",20);
		
		list.add(john);
		list.add(jane);
		list.add(tom);
		
		//sorts the list
		Collections.sort(list);
		
		System.out.println("Student after sorting: ");
		//using forEach method from Stream API
		list.forEach(student -> System.out.println(student.getName()) );
	}

}
