package src.main.java.lab.conditional_satament;

import java.util.Scanner;

public class WeekendName {

	public static void main(String[] args) {
		int  day;
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("enter the number between 1 to 7");
			day=sc.nextInt();
			 switch(day) {
			 case 1:
				 System.out.println("Monday");
			 break;
			 case 2:
				 System.out.println("Tuesday");
			 break;
			 case 3:
				 System.out.println("Wednesday");
			 break;
			 case 4:
				 System.out.println("Thusday");
			 break;
			 case 5:
				 System.out.println("Firday");
			 break;
			 case 6:
				 System.out.println("Saturday");
			 break;
			 case 7:
				 System.out.println("Sunday");
			 break;
			 default:
				 System.out.println("invalid number"); 
			 }
		 

	}

}
