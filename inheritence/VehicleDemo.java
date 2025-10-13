package inheritence;

// Superclass
class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    public void type() {
        System.out.println("Type: Car");
    }
}

class Bike extends Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    public void type() {
        System.out.println("Type: Bike");
    }
}

class Truck extends Vehicle {
    public Truck(String brand, int speed) {
        super(brand, speed);
    }

    public void type() {
        System.out.println("Type: Truck");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 180);
        Bike b = new Bike("Yamaha", 120);
        Truck t = new Truck("Tata", 90);

        c.displayDetails();
        c.type();

        b.displayDetails();
        b.type();

        t.displayDetails();
        t.type();
    }
}
