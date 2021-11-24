package test.day3.equalshashcode;

class Student {
	
	private int rollNumber;
	private String name;
	private String address;
	
	public Student(int rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.rollNumber;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != this.getClass())
		{
			return false;
		}
		//explicit casting
		Student s = (Student) obj;
		
		return s.rollNumber == this.rollNumber; 
	}
	
	
}
