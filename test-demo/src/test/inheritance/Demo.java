package test.inheritance;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mountainBike = new MountainBike(20,10,1);
		
		System.out.println("Gear is " + mountainBike.gear);
		System.out.println("Speed is "+ mountainBike.speed);
		System.out.println("Bike height is "+mountainBike.seatHeight);
		
		mountainBike.applyBrake(1);
		System.out.println("After break the speed is "+mountainBike.speed);
	}

}
