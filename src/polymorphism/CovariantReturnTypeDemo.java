package polymorphism;

//Covariant return types allow overriding methods to return a subtype of the parent class return type.
class Parent {
    Parent get() {
        return this;
    }
}

class Child extends Parent {
    @Override
    Child get() {
        return this;
    }

    void display() {
        System.out.println("This is Child class.");
    }
}

public class CovariantReturnTypeDemo {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent.get();
        child.display();
    }
}
