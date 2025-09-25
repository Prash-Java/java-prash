class AnonymousClasses {
    public void show() {
        System.out.println("Inside show method of AnonymousClasses");
    }
}

public class DemonstrateAnonymousClass {
    public static void main(String[] args) {
        // Creating an instance of AnonymousClasses using an anonymous inner class
        AnonymousClasses obj = new AnonymousClasses() {
            @Override
            public void show() {
                System.out.println("Inside overridden show method of Anonymous Class");
            }
        };

        // Calling the overridden method
        obj.show();
    }
}
