package Inheritance.AccessModifiers.CombinationOfAccessModifiers.CombinationOfAccessModifiers_PKG1.CombinationOfAccessModifiers_PKG2;

import Inheritance.AccessModifiers.CombinationOfAccessModifiers.CombinationOfAccessModifiers_PKG1.CombinationOfAccessModifiers_PKG1.Parent;

public class Child extends Parent {

    public void display(){
        publicMethod(); // Accessible
        protectedMethod();  // Accessible because of inheritance
        // defaultMethod(); // Error: Not accessible outside the package
        // privateMethod(); // Error: Not accessible
    }

}
