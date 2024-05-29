package workspace.string;

public class StringBUfferDemo {
    // java.lang
    //StringBuffer
    public static void main(String[] args) {

//String bulider // java.lang  1.5 version
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("program");
        System.out.println(sb);
        //StringBuffer java.lang 1.5
        StringBuffer ssb = new StringBuffer("Prachi");
        System.out.println(ssb);
        ssb.append("Hirekhan");
        System.out.println(ssb);



    }
}
//    No.	StringBuffer	StringBuilder
//1)	StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.	StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
//        2)	StringBuffer is less efficient than StringBuilder.	StringBuilder is more efficient than StringBuffer.
//        3)	StringBuffer was introduced in Java 1.0	StringBuilder was introduced in Java 1.5
//using String class its possible to create obect using litteral way but using buider buffer not posible
