package workspace.string;
//String is probably the most commoly use in java libary.
// string class is encapuslation under java. lang pacage
// in java, every string that you creat is actually an object of type string
// ine imp thing to notice about sting object is that string objects.
//are imutable that means once a strin object is created it cannot be altreate / char
// creating string objects
// 1.using String literal way
//String name="Prachi";
//2. using new keywords
//String str= new String("prachi"); str is refernce object name is prachi
//
//
public class StringDemo {
    //String is a immuatble class
    //String        1.2
    // StringBuffer mutable 1.5
    //StringBuilder mutable classes 1.5
//    int a;
//    String name="Prachi"; //  name is reference prachi is a object reference typedata// string is a predefined class

    public static void main(String[] args) {
String s1 ="Prachi";
String s2="Prachi";
        System.out.println(s1==s2);
        s1=s1.concat("Hirekhan");
        //System.out.println(s1==s2);
        System.out.println(s1);
    }
}
// obejct is stroed in heap
// string is stored in stack

