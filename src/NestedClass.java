public class NestedClass {

    private String message = "Hello from the outer class!";

    public static class StaticNested {
        public void greet() {
            System.out.println("Hello from the static nested class!");
        }
    }

    class Inner {
        public void display() {
            System.out.println("Accessing outer class message: " + message);
        }
    }

    // Method using an anonymous class
    public void showAnonymousClass() {
        interface Greeter {
            void greet();
        }

        // Anonymous class implementing Greeter
        Greeter g = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Hello from the anonymous class!");
            }
        };

        g.greet(); 
    }

    // Private nested class
    private class Secret {
        void whisper() {
            System.out.println("This is a private nested class speaking.");
        }
    }

    // Method to access the private nested class
    public void revealSecret() {
        Secret s = new Secret();
        s.whisper();
    }

    public static void main(String[] args) {
        StaticNested sn = new StaticNested();
        sn.greet();

        NestedClass outer = new NestedClass();
        Inner inner = outer.new Inner();
        inner.display();
        outer.showAnonymousClass();

        outer.revealSecret();
    }
}
