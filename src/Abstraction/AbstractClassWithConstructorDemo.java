package Abstraction;

//Abstract classes can have constructors to initialize shared properties.

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void drive();

    public void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void drive() {
        System.out.println("Driving a Car.");
    }
}

public class AbstractClassWithConstructorDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.showBrand();
        car.drive();
    }
}

