package vehicles;

public class Car extends Vehicle {
	
	private double fuel;
	
	public Car(){
		setNoOfWheels(4);
		setSpeed(140);
		fuel = 0;
		System.out.println("I'm a car!");
	}
	
	public void FillUp(){
		fuel = 100;
	}
	
	public double drive(double hours){
		double distance = 0;
		if (fuel>hours){
			distance = super.drive(hours);
			fuel -= hours;
		}
		else{
			System.out.println("I don't have fuel enough to drive for that long.");
		}
		return distance;
	}
	

}
