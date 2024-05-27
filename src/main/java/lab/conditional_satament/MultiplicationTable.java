package src.main.java.lab.conditional_satament;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int mul=n*i;
			System.out.println(n+"*"+i+"="+mul);
		}
		
		// TODO Auto-generated method stub

	}

}
