package workspace.execptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{

            int i =10/0 ;// this statement occures the probles
        }catch (ArithmeticException e){
            System.out.println(" divide by  0 not possible");
        }

        finally {
            System.out.println(" i will suarly exceute");
        }
        System.out.println(" this will aslo executed");
    }
}
