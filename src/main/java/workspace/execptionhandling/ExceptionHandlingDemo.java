package workspace.execptionhandling;
/*
hierarchy of exception in java
java .lang
exception                                          error
unchecked ecxption      chekcked exception      VirtualMachineException
RuntimeExecption        SQlWxcpetion              stackOverFLowException
ArithmeticExcpetion     IoException                    Out of memory error
Number formate exception  InteruptedException
illegal argument exception
 null pointer exception
Exception is a parent class handle by all exception
Exceptioc                             Error
can be easily manageable          quite difficult handle the error
checked exception
 checked exception are know to complier is
 the are the exception that are checked at complie time
unchecked exception
they are the excetion that are not checked at compile time,
 because they occur only at run time : that why these exceprion are aslo called run time exception

object


throwable
 */
public class ExceptionHandlingDemo {
    //no.of statements
    // try catch finally throw and throws
   // 1st statement
    // 2st statement// 3st statement// 4st statement
    //.... 1000 statements



    public static void main(String[] args) {
          int a=0;
          int b=7;
          try {
              System.out.println(b/a);
          }catch (Exception ae){
              System.out.println(" some problem");
          }

        System.out.println(" muze bjui print");
    }
}
// jvm gave a all run time exception