// Inner classes are classes defined within another class. They can be used to logically group classes that are only used in one place,
// increase encapsulation, and lead to more readable and maintainable code.
// There are two types of inner classes: non-static inner classes (also known as member inner classes) and static inner classes (also known as nested static classes).
// Non-static inner classes have access to instance members of the outer class, while static inner classes can only access static members of the outer class.
// Non-static inner classes require an instance of the outer class to be instantiated, while static inner classes do not.
// Here's an example demonstrating both types of inner classes:
// Inner classes can be static or non-static. Non-static inner classes can access instance members of the outer class,
// while static inner classes can only access static members of the outer class.

public class OuterClass1 {
    int outerField = 10;
    static int staticOuterField = 20;

    void outerMethod() {
        System.out.println("Outer method");
    }

    static void staticOuterMethod() {
        System.out.println("Static outer method");
    }

    class InnerClass {
        void innerMethod() {
            System.out.println("Inner method");
            System.out.println("Accessing outerField: " + outerField); // Can access instance members of outer class
            outerMethod(); // Can call instance methods of outer class
            System.out.println("Accessing staticOuterField: " + staticOuterField); // Can access static members of outer
                                                                                   // class
            staticOuterMethod(); // Can call static methods of outer class
        }
    }

    static class StaticInnerClass {
        void staticInnerMethod() {
            System.out.println("Static inner method");
            System.out.println("Accessing staticOuterField: " + staticOuterField); // Can access static members of outer
                                                                                   // class
            staticOuterMethod(); // Can call static methods of outer class
        }
    }

    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        OuterClass1.InnerClass inner = outer.new InnerClass(); // Creating instance of non-static inner class
        inner.innerMethod();

        OuterClass1.StaticInnerClass staticInner = new OuterClass1.StaticInnerClass(); // Creating instance of static inner
                                                                                       // class
        staticInner.staticInnerMethod();
    }
}
