package lab.conditional_satament.string;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String m=sc.nextLine();//user
        //input the character sequenct to capmare
        System.out.println("Enter the character compare with: ");
        String charSeq= sc.nextLine();
        // comapre the string
        if(m.contentEquals(charSeq)){
            System.out.println("The m String equals to the specificed  char seq.");
        }else {
            System.out.println("the m string is not equal to character seq");
        }
    }
}
