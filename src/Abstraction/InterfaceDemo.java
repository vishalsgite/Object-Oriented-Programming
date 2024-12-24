package Abstraction;


//An interface allows for 100% abstraction by default (prior to Java 8).
// From Java 8 onward, interfaces can have default and static methods.


interface Animal {
    void sound(); // Abstract method
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}
