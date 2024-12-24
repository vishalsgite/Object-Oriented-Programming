package polymorphism;


//Final methods cannot be overridden but can be used in polymorphic scenarios.
class FinalMethodExample {
    public final void show() {
        System.out.println("This is a final method.");
    }
}

class SubFinalMethodExample extends FinalMethodExample {
    // show() cannot be overridden
}

public class FinalPolymorphismDemo {
    public static void main(String[] args) {
        FinalMethodExample obj = new SubFinalMethodExample();
        obj.show();
    }
}
