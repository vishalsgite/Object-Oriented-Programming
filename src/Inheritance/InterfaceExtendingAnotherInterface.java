package Inheritance;



//An interface can inherit from another interface.
interface ParentInterface {
    void method1();
}

interface ChildInterface extends ParentInterface {
    void method2();
}

class ImplementationClass implements ChildInterface{

    @Override
    public void method2() {
        System.out.println("Method from ChildInterface.");
    }

    @Override
    public void method1() {
        System.out.println("Method from ParentInterface.");
    }
}
public class InterfaceExtendingAnotherInterface {
    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();
        obj.method1();
        obj.method2();
    }
}
