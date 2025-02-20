/* ANDERSON MAINA CT101/G/20948/23*/
// CREATING THE BASE CLASS
class Vehicle {
    protected String brand;
    protected int speed;

    // CREATING A CONSTRUCTOR
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // ACCELERATION METHOD
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " accelerated by " + increase + " km/h. Current speed: " + speed + " km/h");
    }

    // BRAKE METHOD
    public void brake(int decrease) {
        speed = Math.max(speed - decrease, 0); // Ensure speed does not go below zero
        System.out.println(brand + " braked by " + decrease + " km/h. Current speed: " + speed + " km/h");
    }

    //GENERIC SHOWING DETAILS METHOD
    public void showDetails() {
        System.out.println("Vehicle: " + brand + ", Speed: " + speed + " km/h");
    }
}

// INITIALIZING CAR AS SUBCLASS
class Car extends Vehicle {
    private int fuelLevel;

  
    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    // REFUEL METHOD
    public void refuel(int amount) {
        fuelLevel = Math.min(fuelLevel + amount, 100); // Ensure fuel level does not exceed 100%
        System.out.println(brand + " refueled by " + amount + "%. Current fuel level: " + fuelLevel + "%");
    }

    // OVERRIDE SHOWDETAILS METHOD
    @Override
    public void showDetails() {
        System.out.println("Car: " + brand + ", Speed: " + speed + " km/h, Fuel Level: " + fuelLevel + "%");
    }
}

// BIKE SUBCLASSES
class Bike extends Vehicle {
    private boolean helmetOn;

  
    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    // WEARING HELMET METHOD
    public void wearHelmet() {
        helmetOn = true;
        System.out.println(brand + " helmet is now on.");
    }

    // Override showDetails method
    @Override
    public void showDetails() {
        System.out.println("Bike: " + brand + ", Speed: " + speed + " km/h, Helmet On: " + helmetOn);
    }
}

// CREATING THE MAIN CLASS
public class vehicle_system {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", 60, 50);
        car.accelerate(20);  // Accelerate by 20
        car.brake(30);       // Brake by 30
        car.refuel(30);      // Refuel by 30
        car.showDetails();   // Display car details

        
        Bike bike = new Bike("Yamaha", 40, false);
        bike.accelerate(15);  // Accelerate by 15
        bike.brake(10);       // Brake by 10
        bike.wearHelmet();    // Wear helmet
        bike.showDetails();   // Display bike details
    }
}
