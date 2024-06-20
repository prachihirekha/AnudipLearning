package lab.conditional_satament.lab41;


    import java.util.Scanner;

    public class VotingApplication {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            try {
                // Check if the user is eligible to vote
                checkVotingEligibility(age);
                // If no exception is thrown, print a message indicating the user is eligible
                System.out.println("You are eligible to vote.");
            } catch (UnderageException e) {
                // If an UnderageException is caught, print the exception message
                System.out.println(e.getMessage());
            } finally {
                // Close the scanner to free resources
                scanner.close();
            }
        }

        // Method to check if the user's age is 18 or above
        public static void checkVotingEligibility(int age) throws UnderageException {
            if (age < 18) {
                // Throw an UnderageException if the user's age is less than 18
                throw new UnderageException("You must be at least 18 years old to vote. Your age: " + age);
            }
        }
    }

    // Custom exception class for underage voting
    class UnderageException extends Exception {
        public UnderageException(String message) {
            // Pass the exception message to the superclass constructor
            super(message);
        }
    }


