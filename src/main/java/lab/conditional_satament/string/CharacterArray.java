package lab.conditional_satament.string;

import java.util.Scanner;

public class CharacterArray {
    public static void main(String[] args) {
        // scanner scanner object
        Scanner sc = new Scanner(System.in);
        //input sizze of charcter array
        System.out.println("Enter the size of character array");
        int size = sc.nextInt();
        // create a character array of the given size
        char[] chA=new char[size];
        //input character into the array
        System.out.println("enter the character one by one :");
        // using for loop
        for(int i =0;i<size;i++){
            System.out.println("character"+(i+1)+":");
            chA[i]=sc.next().charAt(0);
        }
        // string object form the character array
        String str = new String(chA);
        //output the created string
        System.out.println("the created string is :"+str);
    }
}