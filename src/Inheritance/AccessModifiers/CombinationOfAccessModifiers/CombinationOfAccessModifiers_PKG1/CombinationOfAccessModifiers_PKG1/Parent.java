package Inheritance.AccessModifiers.CombinationOfAccessModifiers.CombinationOfAccessModifiers_PKG1.CombinationOfAccessModifiers_PKG1;

public class Parent {

    public void publicMethod(){
        System.out.println("Public method: Accessible anywhere.");
    }

    protected void protectedMethod(){
        System.out.println("Protected method: Accessible within package or through inheritance.");
    }

    void defaultMethod(){
        System.out.println("Default method: Accessible within the same package.");
    }

    void privateMethod(){
        System.out.println("Private method: Accessible only within this class.");
    }
}
