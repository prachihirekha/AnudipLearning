package workspace.execptionhandling;
// the  java throw kwyword is used to explicitly throw an exception we can  throw either checked or encheked exception in java by throe keyword .
 // the throw keyword is mainly used to throw custom exception
public class ThrowDemo  {
      static void validateAge(int age){
         if(age<18) {
             throw  new ArithmeticException("Age Is not valid");// instance of class
         }else{
             System.out.println(" please vote");
         }
     }
    public static void main(String[] args) {
             validateAge(13);
        System.out.println(" bacha hua code will excute");
    }
}
