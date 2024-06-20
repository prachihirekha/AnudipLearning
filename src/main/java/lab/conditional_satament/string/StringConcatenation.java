package lab.conditional_satament.string;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        // scanner class
        Scanner sc = new Scanner(System.in);
        //input first string
        System.out.println("Enter the first string:");
        String fs=sc.nextLine();//first String
        //second string
        System.out.println(" enter the second string:");
        String ss=sc.nextLine();// second string
        // concatenate the string
        String concat= fs + ss;
        System.out.println("The concatenated string is:"+concat);
    }
}
