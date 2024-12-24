package Encapsulation;


//Encapsulation can also be achieved using nested classes to restrict access.
class OuterClass {
    private String data = "Secret Data";

    // Inner class with access to private members
    class InnerClass {
        public void displayData() {
            System.out.println("Accessing from Inner Class: " + data);
        }
    }
}

public class EncapsulationWithNestedClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayData();
    }
}
