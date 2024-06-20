package lab.conditional_satament.string;

import java.util.Scanner;

public class CharacterIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// create a scaaner clas
        //input string from the usre
        System.out.println("Enter the string :");
        String i = sc.nextLine();// i use for user input
        //input index from the user
        System.out.println(" Enter the index: ");
        int index = sc.nextInt();
        if (index >= 0 && index < i.length()) {
            char c = i.charAt(index);// c is use for character
            System.out.println("The character at index " + index + " is " + c);
        } else {
            System.out.println("Index out of bound. please enter a valid index.");
        }
    }
}