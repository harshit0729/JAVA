package hj;

public class dayfive {
	String companyName;
	String model;
	String fuelType;
	String color;
	int sittingCar;
	int maxSpeed;
	
	public void start() {
		System.out.println("car started");

	}
	public void drive() {
		System.out.println("driving mode");
	}
	public void breakk() {
		System.out.println("break the car");
	}
	public void stop() {
		System.out.println("car Stop");
	}
	public static void main(String[] args) {
		dayfive car = new dayfive();
		
		car.companyName="tata";
		car.model="latest";
		car.fuelType="petrol";
		car.color="black";
		car.sittingCar=5;
		car.maxSpeed=220;
	
		
		 car.start();
	        car.drive();
	        car.breakk();
	        car.stop();
	    	
			System.out.println("Car Details:");
	        System.out.println("Company Name: " + car.companyName);
	        System.out.println("Model: " + car.model);
	        System.out.println("Fuel Type: " + car.fuelType);
	        System.out.println("Color: " + car.color);
	        System.out.println("Sitting Capacity: " + car.sittingCar);
	        System.out.println("Max Speed: " + car.maxSpeed + " km/h");
}
	
	
}



