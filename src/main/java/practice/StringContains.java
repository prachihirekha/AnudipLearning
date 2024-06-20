package practice;

import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        // create a scanner class
        Scanner sc =new Scanner(System.in);
        // enter the string
        System.out.println("Enter the string");
        String m = sc.nextLine();
        System.out.println("enter the sequence to seach ");
        String seq= sc.nextLine();
        boolean b= m.contains(seq);
        // print the res
        if(b){
            System.out.println("the m string contain the specified sequence");
        }else {
            System.out.println(" the m string does not contain the specified sequ");
        }
    }
}
