package Project2;

public class exceptionhandling {

	public static void main(String[] args) {
        try {
            int result = divide(10, 0); 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
        	
            // Handle a specific exception
            System.err.println("Error: Cannot divide by zero!");
            e.printStackTrace();
        } catch (Exception e) {
        	
            // Handle any other exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
        	
            // Code that always runs
            System.out.println("Execution completed.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
	
}
