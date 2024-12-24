package Inheritance;


//In multilevel inheritance, a class inherits from a class, which is also inherited by another class.
class GrandParent{
    void greet(){
        System.out.println("Hello from the grandparent class.");
    }
}

class Parent1 extends GrandParent{
    void show() {
        System.out.println("Hello from the parent class.");
    }
}

class Child1 extends Parent1 {
    void display() {
        System.out.println("Hello from the child class.");
    }
}

public class MultilevelInheritanceDemo {

    public static void main(String[] args) {
        GrandParent gp = new GrandParent();
        gp.greet();

        Parent1 pr = new Parent1();
        pr.show();
        pr.greet();

        Child1 ch = new Child1();
       ch.greet();
       ch.show();
       ch.display();
    }
}
