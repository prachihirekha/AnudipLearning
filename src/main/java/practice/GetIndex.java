package practice;

import java.util.Scanner;

public class GetIndex {
    public static void main(String[] args) {
        // create a scanner class for the input
        Scanner sc= new Scanner(System.in);
        // enter the string
        System.out.println("Enter the string");
        String n=sc.nextLine();//Sore in n
        // enter the index
        System.out.println("enter the index");
        int  index =sc.nextInt();

        if(index>=0 && index<n.length()){
            // get the charahter at the iven b
            char c = n.charAt(index);
            System.out.println(index +"is"+ c);
        }
        else{
            System.out.println("Index out of range. enter the vaild index between 0 and"+(n.length()-1));
        }
    }
}
