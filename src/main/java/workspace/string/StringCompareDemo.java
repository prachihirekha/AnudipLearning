package workspace.string;
//String comparison
// string comparison can be done in 3 way.
//using equals() method
// using == operator
// 3 by compareTo() method
//
public class StringCompareDemo {
    //eqals() method compares two string for equality
    // it compares the content of the string
    // it will return true if string matches, else return false.
    public static void main(String[] args) {
        String s= " hell";
        String s1=" hello";
        String s2="hello";
       // String s3 =new String("hello");
        System.out.println(s==s2);
        System.out.println(s1==s2);
// == operator compare tow object reference to check whether they refer to same instance; this also will retun true on successful match
        //we will discuss whic isthe
        //them caparing thosw  two reference using == operator will return true/\.
        //equals () method, if not overridde will peform same compa


//        System.out.println(s1.equals(s3));
//        System.out.println(s.equals(s1));
//        System.out.println(s.equals(s2));
    }
}
// shollow comparison
// deep comparison
//String s1= "java";
//String s2="java";
//s1==s2 // true// checkung the refernce
//s1.equals(s2);// true
//s1.hashCode(s2)//true
// you may conclude that if there is requirement of comparin g two string object on theis physicaal address, then use"==" operator and f there is a  reuirement of comparing to//
 //string iject on thir contents, then use equals() method or hashcode() method
//
