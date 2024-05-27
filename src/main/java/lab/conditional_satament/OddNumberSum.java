package src.main.java.lab.conditional_satament;

import java.util.Scanner;

public class OddNumberSum {

	public static void main(String[] args) {
		int num=1;
		int count=0;
		Scanner sc = new Scanner(System.in);
				System.out.println("enter the number");;
		num=sc.nextInt();
		System.out.println("natural number"+num);
		int sum=0;
		while(count<num) {
		if(num%2!=0) {
			 sum=sum+num;
			 count++;
			 }
		
			System.out.println("odd number"+num+"sum of a number"+sum);
		}
		 
			
		
		// TODO Auto-generated method stub

	}

}
//class 
//object 
//variable
// datatype
// method invoked
// arrays
// constructor
//private

