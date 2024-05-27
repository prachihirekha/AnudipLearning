package workspace.wrapper_class;
/*
//data types  wrapper class
//byte       Byte
//short     Short
//int       Integer
//long     LOng
//folat     Float
//double    Double
//char     Charater
//boolean     Boolean
//
//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive. Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.
 static void overloadMethod(Integer i){
        System.out.println("Interger wrapper class type");
    }
    static void overloadMethod(long l){
        System.out.println("long primitive type");
    }


    public static void main(String[] args) {
        int i=21;
        overloadMethod(i);
    }// auto widning - implicit type casting
 */
// if you are passing primitve data type as an argument to the method call, compiler first check for a method defintation which take sa
// it such method does not exist , then it checks  for the method definition which takes big sized prmitixe data type than passes data type.
// is ti tried to perform autowinding convertion  of passes data type.
// if  autowidig
public class WrapperDemo {
    static void overloadMethod(Number n){
        System.out.println("number class type");
    }
    static void overloadMethod(Double i){
        System.out.println("Interger wrapper class type");
    }
    static void overloadMethod(Long l){
        System.out.println("long primitive type");
    }


    public static void main(String[] args) {
        int i=21;
        // primitive type of  data into object type - auto boxing - unboxing
        overloadMethod(i);// auto upcasting
    }
}
/*
object
number |

|^
|auto upcasting
Byte Short Integer Long Float Double

|
| auto - boxing
|
byte shor int long float double
----> auto widing->>
 */
