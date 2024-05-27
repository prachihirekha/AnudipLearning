package lab.conditional_satament.logical_program;

import java.util.Scanner;

public class BasicCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                scanner.close();
                return;
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }
}

//        Example Input:
//        First number: 10
//        Second number: 5
//        Operator: +
//        Execution Steps:
//        Input Handling:
//
//        num1 is set to 10.
//        num2 is set to 5.
//        operator is set to +.
//        Switch Case Execution:
//
//        The switch statement checks the operator.
//        For operator = '+':
//        result = num1 + num2 → result = 10 + 5 → result = 15.
//        Output:
//
//        The program prints: The result is: 15.
//        Example Input with Division by Zero:
//        First number: 10
//        Second number: 0
//        Operator: /
//        Execution Steps:
//        Input Handling:
//
//        num1 is set to 10.
//        num2 is set to 0.
//        operator is set to /.
//        Switch Case Execution:
//
//        The switch statement checks the operator.
//        For operator = '/':
//        It checks if num2 != 0. Since num2 = 0, it prints: Error: Division by zero. and exits.
//
