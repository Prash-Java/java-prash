abstract class AbstractClasses3 {
    public abstract void showInfo();

    public abstract void displayMessage();

    public void concreteMethod() {
        System.out.println("This is a concrete method in AbstractClasses3.");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating an instance of AbstractClasses3 using an anonymous inner class
        AbstractClasses3 obj = new AbstractClasses3() {
            @Override
            public void showInfo() {
                System.out.println("Hello from the anonymous inner class of AbstractClasses3!");
            }
            @Override
            public void displayMessage() {
                System.out.println("Display from the anonymous inner class of AbstractClasses3!");
            }
        };
        obj.showInfo();
        obj.displayMessage();
        obj.concreteMethod();
    }
}
