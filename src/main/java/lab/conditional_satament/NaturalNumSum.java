package src.main.java.lab.conditional_satament;

import java.util.Scanner;

public class NaturalNumSum {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the nnmber");
	     n=sc.nextInt();
	     for(int i=0;i<=n;i++) {
	    	 System.out.println(i+" ");
	    	 sum+=i;
	     }
	     System.out.println("the sum of first" +n+" sum of second number"+ sum);
	    
	
			
		
	}

}
