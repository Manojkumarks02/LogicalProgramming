package designPattern.singleton;

public class Singleton1 {
        // Step 1: Create a private static instance of the class (eager initialization)
        private static final Singleton1 instance = new Singleton1();

        // Step 2: Make the constructor private so it can't be instantiated from outside the class
        private Singleton1() {
            // Private constructor to prevent instantiation
        }

        // Step 3: Provide a public static method to return the instance
        public static Singleton1 getInstance() {
            return instance;
        }

        // Example method to demonstrate Singleton behavior
        public void showMessage() {
            System.out.println("Hello from Singleton!");
        }

        public static void main(String[] args) {
            // Get the only instance of Singleton
            Singleton1 singleton = Singleton1.getInstance();

            // Call the method of the Singleton instance
            singleton.showMessage();
        }
    }


