package lab.conditional_satament.lab41;


    public class ExceptionHandlingDemo {

        public static void main(String[] args) {
            try {
                // Attempt to divide by zero
                int result = divide(10, 0);
                // This line will not be executed if an exception is thrown
                System.out.println("The result is: " + result);
            } catch (ArithmeticException e) {
                // Catch the ArithmeticException and print an error message
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Program continues after the try-catch block.");
        }

        // Method to perform division and throw an ArithmeticException if the denominator is zero
        public static int divide(int numerator, int denominator) {
            if (denominator == 0) {
                // Throw an ArithmeticException with a custom message
                throw new ArithmeticException("Cannot divide by zero");
            }
            return numerator / denominator;
        }
    }


