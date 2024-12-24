package Inheritance.AccessModifiers;


class Parent {
    public void show() {
        System.out.println("Public method: Accessible from anywhere.");
    }

}
class Child extends Parent {
    public void display() {
        System.out.println("Child accessing public method of parent.");
    }
}
public class PublicAccessModifierDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.show();
    }
}
