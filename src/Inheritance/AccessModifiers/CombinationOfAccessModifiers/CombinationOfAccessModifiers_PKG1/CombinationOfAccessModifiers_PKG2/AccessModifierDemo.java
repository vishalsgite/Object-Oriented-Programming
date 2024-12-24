package Inheritance.AccessModifiers.CombinationOfAccessModifiers.CombinationOfAccessModifiers_PKG1.CombinationOfAccessModifiers_PKG2;

import Inheritance.AccessModifiers.CombinationOfAccessModifiers.CombinationOfAccessModifiers_PKG1.CombinationOfAccessModifiers_PKG1.Parent;

public class AccessModifierDemo {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.publicMethod();  //// Accessible
        // parent.protectedMethod(); // Error: Not accessible without inheritance
        // parent.defaultMethod(); // Error: Not accessible outside the package
        // parent.privateMethod(); // Error: Not accessible

        Child ch = new Child();
        ch.display();   // Access through inheritance
        ch.publicMethod();



    }
}

/*           Same Class   Same Package    Sub Class(Same Package)  Sub class(Different Package)  Other Classes
public	      ✅               ✅	             ✅	                       ✅	                      ✅
protected     ✅           	   ✅	             ✅	                       ✅	(via inheritance)     ❌
default	      ✅	           ✅	             ✅	                       ❌	                      ❌
private       ✅	           ❌	             ❌	                       ❌	                      ❌
 */