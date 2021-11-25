package test.day3.comparable;

class Student implements Comparable<Student> {

	private int rollNumber;
	private String name;
	private int age;
	
	public Student(int rollNumber, String name, int age) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//Positive value takes priority, Negative value mean object o will take priority, 0 means any can be priority
		return this.rollNumber - o.rollNumber;
	}
}
