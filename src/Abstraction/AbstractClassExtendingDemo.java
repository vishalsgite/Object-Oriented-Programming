package Abstraction;


//An abstract class can extend another abstract class.
abstract class animal {
    abstract void eat();

    void sleep() {
        System.out.println("Animal sleeps.");
    }
}

abstract class Mammal extends animal {
    abstract void walk();
}

class Human extends Mammal {
    @Override
    void eat() {
        System.out.println("Human eats food.");
    }

    @Override
    void walk() {
        System.out.println("Human walks upright.");
    }
}

public class AbstractClassExtendingDemo {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.walk();
        human.sleep();
    }
}
