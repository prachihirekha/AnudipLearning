package src.main.java.classwork;

import java.util.Scanner;

// write a java program to display n terms of natural numberss and their sum and avg.
public class ExerciseForSum {

	public static void main(String[] args) {
		int i, n, sum=0, count=2, avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		n=sc.nextInt();
		count=sc.nextInt();
		System.out.println("the number are "+ n);
		for(i=1;i<=n;i++) {
			System.out.println(i);
			//sum+=i;// 
			sum = sum+ i;
			avg=sum/count;
			
		}
		System.out.println("the sum of number are"+ n+" "+sum);
		System.out.println("the avg");
	}

}
