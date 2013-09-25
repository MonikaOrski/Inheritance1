package vehicles;

public class MainClass {
	
	public static void main(String[] args){
		/*
		Vehicle genericVehicle = new Vehicle();
		Bicycle myBike = new Bicycle();
		Car myCar = new Car();
		double dist1, dist2, dist3, dist4;
		dist1 = genericVehicle.drive(2);
		System.out.println("dist1 = " + dist1);
		dist2 = myBike.drive(2);
		System.out.println("dist2 = " + dist2);	
		dist3 = myCar.drive(2);
		System.out.println("dist3 = " + dist3);
		myCar.FillUp();
		dist4 = myCar.drive(2);
		System.out.println("dist4 = " + dist4);
		
		Bus myBus = new Bus();
		double dist;
		dist = myBus.drive(1);
		System.out.println("dist = " + dist);
		myBus.setMaxPassengers(50);
		int max = myBus.getMaxPassengers();
		System.out.println("Maximum number of passengers: " + max); 
		myBus.addPassengers(20);
		dist = myBus.drive(1);
		System.out.println("dist = " + dist);
		*/
		Tricycle myTricycle = new Tricycle();
		Tandem myTandem = new Tandem();
		int h1 = myTricycle.getNoOfHandles();
		int h2 = myTandem.getNoOfHandles();
		int w1 = myTricycle.getNoOfWheels();
		int w2 = myTandem.getNoOfWheels();
		System.out.println("myTricycle: " + h1 + " handles and " + w1 + " wheels");
		System.out.println("myTandem: " + h2 + " handles and " + w2 + " wheels");
		
		Vehicle v = (Vehicle)myTandem;
		String className = v.getClass().getName();
		System.out.println("className: " + className);
		if (v instanceof Tandem) {
			System.out.println("It's a Tandem.");
		}
		if (v instanceof Bicycle) {
			System.out.println("It's a Bicycle.");
		}
		if (v instanceof Car) {
			System.out.println("It's a Car.");
		}
	}

}
