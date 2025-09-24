// An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed.
// It can contain abstract methods (methods without a body) that must be implemented by subclasses,
// as well as concrete methods (methods with a body) that can be used by subclasses.

// If any abstract method is declared in a class, the class must be declared as abstract but vice versa is not true.

public abstract class AbstractClasses {
    public abstract void abstractMethod(); // Abstract method
    public void concreteMethod() { // Concrete method
        System.out.println("This is a concrete method.");
    }
}

class SubClass extends AbstractClasses {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }

    public static void main(String[] args) {
        // Creating an instance of the subclass which implements the abstract method,
        SubClass obj = new SubClass();
        obj.abstractMethod(); // Calls the implemented abstract method
        obj.concreteMethod(); // Calls the concrete method from the abstract class

        // Using abstract class reference to refer to subclass object,
        AbstractClasses absObj = new SubClass(); // Abstract class reference
        absObj.abstractMethod(); // Calls the implemented abstract method
        absObj.concreteMethod(); // Calls the concrete method from the abstract class
    }
}
