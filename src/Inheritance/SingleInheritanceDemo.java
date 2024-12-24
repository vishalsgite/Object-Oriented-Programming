package Inheritance;


//Single inheritance is when a class inherits from one parent class.
class Parent{

    void show(){
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent{
    void display() {
        System.out.println("This is the child class.");
    }


}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        Parent pr = new Parent();
        Child ch = new Child();

        pr.show();
        ch.show();
        ch.display();
    }
}
