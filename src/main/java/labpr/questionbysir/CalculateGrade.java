package labpr.questionbysir;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> grade= new ArrayList<>();
        System.out.println("enter the student grade between 0-100. Type 'done' for fisnhes");
        while (true){
            System.out.println("enter the grade:");
            String i= sc.nextLine();
            if(i.equalsIgnoreCase("done")){
                break;
            }
            try{
                double g= Double.parseDouble(i);
                if(g>=0||g<=100){
                    grade.add(g);
                }else {
                    System.out.println("Invalid grade.enter the value btw 0 to 100");
                }
            }catch (NumberFormatException e){
                System.out.println("invalid i.enter the valid number or 'done' to fisnish");
            }
        }if(!grade.isEmpty()){
            double avg =grade.stream().mapToDouble(Double::doubleValue).average().orElse(0);
            System.out.println("avg:"+avg);
        }else {
            System.out.println("no grades enter");
        }

    }
}
