package vehicles;

public class Bus extends Vehicle {
	
	private int noOfPassengers;
	private int maxNoOfPassengers;
	
	public Bus(){
		setNoOfWheels(4);
		setSpeed(90);
		maxNoOfPassengers = 40;
		noOfPassengers = 0;
		System.out.println("I'm a bus!");
	}
	
	public int getMaxPassengers(){
		return maxNoOfPassengers;
	}
	
	public void setMaxPassengers(int mp){
		maxNoOfPassengers = mp;
	}
	
	public void addPassengers(int noP){
		noOfPassengers += noP;
	}
	
	public void subPassengers(int noP){
		noOfPassengers -= noP;
	}
	
	public double drive(double hours){
		double distance = 0;
		if ((noOfPassengers > 0) && (noOfPassengers <= maxNoOfPassengers)){
			distance = super.drive(hours);
		}
		else{
			System.out.println("I'm not going to drive with " + noOfPassengers + " passengers.");
		}
		return distance;
	}

}
