package test.Interface;

class MountainBikes implements Bicycle {

	private int seatHeight;
	private int gear;
	private int speed;
	
	
	public MountainBikes(int seatHeight, int gear, int speed) {
		
		this.seatHeight = seatHeight;
		this.gear = gear;
		this.speed = speed;
	}
	public int getSeatHeight() {
		return seatHeight;
	}
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		speed -= decrement;
		
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed += increment;
	}
	
}
