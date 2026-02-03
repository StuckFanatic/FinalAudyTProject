package Project2;

public class exceptionhandling {

	public static void main(String[] args) {
        System.out.println("Starting.");

        try {
            // Code that might throw an exception
            int result = divide(10, 0); 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle specific exception
            System.out.println("Error: Cannot divide by zero.");
            e.printStackTrace(); 
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        } finally {
            // Code that always runs
            System.out.println(" Block executed.");
        }

        System.out.println(" End.");
    }

    // Simple method that may throw an exception
    public static int divide(int a, int b) {
        return a / b;
    }
	
}
