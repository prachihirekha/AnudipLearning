package src.main.java.lab.conditional_satament;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {
		// intizili the variable
		int i;
		Scanner sc = new Scanner(System.in);// scanner class
		System.out.println("enter the number");
		i=sc.nextInt();
		if(i>0) {
			System.out.println("it is positive number");
		}
		else {
			System.out.println("it is negative number");
		}

	}

}
