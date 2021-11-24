package test.day3.MethodOverloading;

public class MethodOverloading {
	
	public int multiply(int x, int y)
	{
		return x*y;
	}
	public int multiply(int x, int y, int z)
	{
		return x*y*z;
	}
	public double multiply(double x, double y)
	{
		return x*y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading test = new MethodOverloading();
		System.out.println(test.multiply(1, 3));
		System.out.println(test.multiply(3, 3, 3));
		System.out.println(test.multiply(1.5, 1.5));
	}

}
