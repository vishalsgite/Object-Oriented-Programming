package Inheritance.AccessModifiers;



//The default modifier allows access only within the same package.
class Parent2 {
    void show() { // Default access modifier
        System.out.println("Default method: Accessible within the same package.");
    }
}
class Child2 extends Parent2 {
    public void display() {
        show(); // Accessible within the same package
        System.out.println("Child accessing default method of parent.");
    }
}

public class DefaultAccessModifierDemo {

    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.show();
        ch.display();

    }
}
