package Abstraction;

//An interface can extend another interface.

interface Machine {
    void start();
}

interface AdvancedMachine extends Machine {
    void stop();
}

class Robot implements AdvancedMachine {
    @Override
    public void start() {
        System.out.println("Robot starts.");
    }

    @Override
    public void stop() {
        System.out.println("Robot stops.");
    }
}

public class InterfaceExtendingDemo {
    public static void main(String[] args) {
        AdvancedMachine robot = new Robot();
        robot.start();
        robot.stop();
    }
}
