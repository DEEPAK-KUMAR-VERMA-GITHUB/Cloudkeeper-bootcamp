package exception_handling;

public class ExceptionPropagation {

    // Method 1
    public static void m1() {
        try {
            m2(); // Call m2 which calls m3
        } catch (Exception e) {
            System.out.println("Caught exception in m1: " + e);
            // Re-throw the exception to be handled by another higher-level catch block
            throw e;
        }
    }

    // Method 2
    public static void m2() {
        m3(); // Call m3 which causes division by zero
    }

    // Method 3 - Divides by zero
    public static void m3() {
        int result = 10 / 0; // This will cause ArithmeticException (division by zero)
    }

    public static void main(String[] args) {
        try {
            m1(); // Start the chain by calling m1
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }
    }
}
