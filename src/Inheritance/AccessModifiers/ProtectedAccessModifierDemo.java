package Inheritance.AccessModifiers;

//The protected modifier allows access within the same package or through inheritance.

class Parent1 {
    protected void show() {
        System.out.println("Protected method: Accessible within package or through inheritance.");
    }
}

class Child1 extends Parent1 {
    public void display() {
        show(); // Accessible via inheritance
        System.out.println("Child accessing protected method of parent.");
    }
}
public class ProtectedAccessModifierDemo {
    public static void main(String[] args) {
        Child1 ch = new Child1();

        ch.show();
        ch.display();
    }
}
