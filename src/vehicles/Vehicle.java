package vehicles;

// The generic vehicle class

public class Vehicle {
	private int wheels;
	private double speed;
	
	public Vehicle(){
		wheels = 0;
		speed = 0;
		System.out.println("I'm a vehicle!");
	}
	
	public int getNoOfWheels(){
		return wheels;
	}
	
	public void setNoOfWheels(int wheels){
		this.wheels = wheels;
	}
	
	public double getSpeed(){
		return this.speed;
	}
	
	public void setSpeed(double speed){
		this.speed = speed;
	}
	
	/**
	 * Simulate driving the vehicle for a set time
	 * @param hours
	 * @return distance traveled
	 */
	public double drive(double hours){
		double distance = hours * speed;
		return distance;
	}

}
