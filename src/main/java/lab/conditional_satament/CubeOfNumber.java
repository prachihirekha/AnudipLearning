package src.main.java.lab.conditional_satament;

import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	 n =sc.nextInt();
	 System.out.println("1 to"+n);
	 for(int i=1;i<=n;i++) {
		 int cube=i*i*i;
		 System.out.println(" cube of natural number ="+cube);
	 }

	}

}
