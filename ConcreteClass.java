abstract class AbstractClasses2 {
    public abstract void displayMessage();
}

public class ConcreteClass extends AbstractClasses2 {
    @Override
    public void displayMessage() {
        System.out.println("Hello from the concrete class!");
    }

    public static void main(String[] args) {
        AbstractClasses2 obj = new ConcreteClass();
        obj.displayMessage();
    }
}
