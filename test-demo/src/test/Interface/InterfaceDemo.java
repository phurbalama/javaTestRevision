package test.Interface;

import test.inheritance.MountainBike;

class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBikes mountainBike = new MountainBikes(10,20,20);
		
		System.out.println("Gear is " + mountainBike.getGear());
		System.out.println("Speed is "+ mountainBike.getSpeed());
		System.out.println("Bike height is "+mountainBike.getSeatHeight());
		
		mountainBike.applyBrake(1);
		System.out.println("After break the speed is "+mountainBike.getSpeed());
	}

}
