package workspace.execptionhandling;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt("Prachi");
        }catch (NumberFormatException e){
            System.out.println("Number format exception");
        }
    }
}
