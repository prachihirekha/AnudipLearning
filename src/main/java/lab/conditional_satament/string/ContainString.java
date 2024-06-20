package lab.conditional_satament.string;

import java.util.Scanner;

public class ContainString {
    public static void main(String[] args) {
        //Sccaner class
        Scanner sc = new Scanner(System.in);
        // input string
        System.out.println("Enter the main string: ");
        String s=sc.nextLine();//main string
        //input the sequence of characters to search for
        System.out.println("Enter ths sequence for: ");
        String sq=sc.nextLine();//sq use for sequence
        //check if the main string contan the specified sequence
        if(s.contains(sq)){
            System.out.println("The main string contains squence");
        }else{
            System.out.println(" the main string does not conatin the specificed sequence");
        }
    }
}
