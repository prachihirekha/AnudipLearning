package practice;

import java.util.Scanner;

public class EndString {
    public static void main(String[] args) {
        // create a obect of scanner
        Scanner sc = new Scanner(System.in);
        //enter the sting
        System.out.println("Enter the String");
        String str = sc.nextLine();
        // enter the suffix
        System.out.println("enter the suffix string");
        String suf= sc.nextLine();
        // check the end string
        boolean endWithSuf=  str.endsWith(suf);
        // print result
        if(endWithSuf){
            System.out.println("The main string end with the suffix");
        }else {
            System.out.println("the main str does not end with the suf");
        }
    }
}
