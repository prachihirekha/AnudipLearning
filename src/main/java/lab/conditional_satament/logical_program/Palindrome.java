package src.main.java.lab.conditional_satament.logical_program;
import java.util.Scanner;
public class Palindrome {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int originalNumber = number;
	        int reversedNumber = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        if (originalNumber == reversedNumber) {
	            System.out.println(originalNumber + " is a palindrome.");
	        } else {
	            System.out.println(originalNumber + " is not a palindrome.");
	        }

	        scanner.close();
	    }
	}
//	Initialization and Input:
//
//		The program prompts the user for the first number and stores 10 in num1.
//		It then prompts for the second number and stores 5 in num2.
//		It asks for the operator and stores + in operator.
//		Switch Case Execution:
//
//		The switch statement checks the value of operator:
//		Since operator is +, the case for + is executed.
//		result = num1 + num2 → result = 10 + 5 → result = 15.
//		Output:
//
//		The program prints The result is: 15.
//		Example Input with Division by Zero:
//		First number: 10
//		Second number: 0
//		Operator: /
//		Execution Steps:
//		Initialization and Input:
//
//		First number: 10 is stored in num1.
//		Second number: 0 is stored in num2.
//		Operator: / is stored in operator.
//		Switch Case Execution:
//
//		The switch statement checks the value of operator:
//		Since operator is /, the case for / is executed.
//		It checks if num2 is not zero. Since num2 is 0, it prints Error: Division by zero..
//		The program terminates early using return.
//		Code Explanation:
//		Input Handling:
//
//		Uses Scanner to get user input for two numbers and an operator.
//		Switch Statement:
//
//		Evaluates the operator and performs the corresponding arithmetic operation.
//		Handles division by zero to avoid runtime errors.