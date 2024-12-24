package polymorphism;


//An abstract class also allows achieving polymorphism.
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick.");
    }
}

public class AbstractClassPolymorphismDemo {
    public static void main(String[] args) {
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.start();

        vehicle = new Bike();
        vehicle.start();
    }
}
