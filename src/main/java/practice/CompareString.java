package practice;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);
        //enter the sting
        System.out.println(" enter the first word");
        String  first =sc.nextLine();
        // enter te second
        System.out.println("enter the second word");
        String second = sc.nextLine();
        // check the two word
        boolean isEqual= first.equals(second);
        // print res
        if(isEqual){
            System.out.println("the thw string cotnain the same data");
        }
        else {
            System.out.println("not same data");
        }

    }
}
