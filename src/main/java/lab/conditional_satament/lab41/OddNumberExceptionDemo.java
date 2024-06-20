package lab.conditional_satament.lab41;

    public class OddNumberExceptionDemo {

        public static void main(String[] args) {
            try {
                checkEvenNumber(10);  // Should not throw an exception
                System.out.println("10 is an even number.");

                checkEvenNumber(7);   // Should throw an exception
                System.out.println("This line will not be printed because 7 is an odd number.");
            } catch (OddNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        // Method to check if the number is even
        public static void checkEvenNumber(int number) throws OddNumberException {
            if (number % 2 != 0) {
                throw new OddNumberException("The number " + number + " is odd.");
            }
        }
    }

    // Custom exception class for odd numbers
    class OddNumberException extends Exception {
        public OddNumberException(String message) {
            super(message);
        }
    }



