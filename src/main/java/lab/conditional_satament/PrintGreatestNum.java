package src.main.java.lab.conditional_satament;

import java.util.Scanner;

public class PrintGreatestNum {

	public static void main(String[] args) {
	int x;
	int y;
	int z;
	Scanner sc = new Scanner(System.in);
	//System.out.println("enter the numbers of x, y,z");
	System.out.println("Enter the x number");
	x=sc.nextInt();
	System.out.println("Enter the y number");
	y=sc.nextInt();
	System.out.println("Enter the z number");
		z=sc.nextInt();
	
	if(x>y && x>z) {
		System.out.println("x is grater nuber"+x);
	}else if(y>x && y>z) {
		System.out.println("y is grater number"+y);
	}else {
		System.out.println("z is greater number"+z);
	}
}

}
