package Abstraction;


//An abstract class can have final methods, which cannot be overridden.
abstract class Appliance {
    abstract void turnOn();

    final void warrantyDetails() {
        System.out.println("Warranty: 1 year.");
    }
}

class WashingMachine extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Washing Machine turns on.");
    }
}

public class AbstractClassWithFinalMethodDemo {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.turnOn();
        wm.warrantyDetails(); // Final method called
    }
}
