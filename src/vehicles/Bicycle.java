package vehicles;

public class Bicycle extends Vehicle{
	
	private int noOfHandles;
	
	public Bicycle(){
		setNoOfWheels(2);
		setSpeed(22.5);
		noOfHandles = 1;
		System.out.println("I'm a bicycle!");
	}
	
	public int getNoOfHandles(){
		return noOfHandles;
	}
	
	public void setNoOfHandles(int h){
		noOfHandles = h;
	}

}
