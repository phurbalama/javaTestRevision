package test.inheritance;

public class MountainBike extends Bicycle {
	
	public int seatHeight;

	public MountainBike(int startHeight, int startSpeed, int startGear) {
		//base class constructor
		super(startSpeed, startGear);
		this.seatHeight = startHeight;
		
	}
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
}
