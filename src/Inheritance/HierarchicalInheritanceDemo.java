package Inheritance;

class Parent2 {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class Child2 extends Parent2 {
    void display1() {
        System.out.println("This is the first child class.");
    }
}

class Child3 extends Parent2 {
    void display2() {
        System.out.println("This is the second child class.");
    }
}



//In hierarchical inheritance, multiple child classes inherit from the same parent class.
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        Child2 ch1 = new Child2();
        ch1.show();
        ch1.display1();

        Child3 ch2 = new Child3();
        ch2.show();
        ch2.display2();
    }
}
