package Inheritance;

/*
Hybrid inheritance is a combination of two or more types of inheritance.
In Java, it can only be achieved using interfaces.
 */

interface Interface3 {
    void method1();
}

interface Interface4 {
    void method2();
}

class Child4 implements Interface3{

    @Override
    public void method1() {
        System.out.println("Method from Interface3.");
    }
}

class Child5 extends Child4 implements Interface4{

    @Override
    public void method2() {
        System.out.println("Method from Interface4.");
    }
}
public class HybridInheritanceUsingInterfaces {
    public static void main(String[] args) {
        Child5 ch = new Child5();
        ch.method1();
        ch.method2();

    }
}
