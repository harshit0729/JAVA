package hj;

public class Car {
    String companyName;
    String model;
    String fuelType;
    String color;
    int seatingCapacity;
    int maxSpeed;

   
    public Car() {
        this.companyName = "Unknown";
        this.model = "Unknown";
        this.fuelType = "Unknown";
        this.color = "Unknown";
        this.seatingCapacity = 0;
        this.maxSpeed = 0;
    }

    public Car(String companyName, String model, String fuelType, String color, int seatingCapacity, int maxSpeed) {
        this.companyName = companyName;
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.maxSpeed = maxSpeed;
    }

  
    public void stop() {
        System.out.println("Car has stopped.");
    }

    public static void main(String[] args) {
        
        dayfive car = new dayfive();

       
        car.companyName = "Tata";
        car.model = "Nexon";
        car.fuelType = "Petrol";
        car.color = "Blue";
//        car.seatingCapacity = 5;
        car.maxSpeed = 180;


        System.out.println("Car Details:");
        System.out.println("Company Name: " + car.companyName);
        System.out.println("Model: " + car.model);
        System.out.println("Fuel Type: " + car.fuelType);
        System.out.println("Color: " + car.color);
//        System.out.println("Seating Capacity: " + car.seatingCapacity);
        System.out.println("Max Speed: " + car.maxSpeed + " km/h");

   
        car.stop();
    }
}
