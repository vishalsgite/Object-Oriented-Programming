package Abstraction;

//All variables in an interface are implicitly public, static, and final.

interface Constants {
    int MAX_SPEED = 100; // Constant
    String TYPE = "Electric";
}

class ElectricCar implements Constants {
    public void showDetails() {
        System.out.println("Max Speed: " + MAX_SPEED);
        System.out.println("Type: " + TYPE);
    }
}

public class InterfaceWithConstantsDemo {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.showDetails();
    }
}

