package workspace.inner_class;

//class OuterClass{
//    int x =10;
//    class InnerClass{
//        int y=5;
//    }
//}
//
//public class MainDemo {
//    public static void main(String[] args) {
//        OuterClass ot = new OuterClass();
//        //syntax for creating inner class object
//        OuterClass.InnerClass  in = ot.new InnerClass();
//        System.out.println(in.y);
//        System.out.println(ot.x);
//    }
//}
//class OuterClass{
//    int x =10;
//     private class InnerClass{
//        int y=5;
//    }
//}
//
//public class MainDemo {
//    public static void main(String[] args) {
//        OuterClass ot = new OuterClass();
//        //syntax for creating inner class object
//        OuterClass.InnerClass  in = ot.new InnerClass();
//        System.out.println(in.y);
//        System.out.println(ot.x);
//    }
//}
// if  i putting the private as a inner class it is not accessable for the outer class
class OuterClass{
    int x =10;
    static class InnerClass{
        int y=5;
    }
}

public class MainDemo {
    public static void main(String[] args) {
        OuterClass ot = new OuterClass();
        // without  creating the object
        //static asl tr aaplya la object class of outer class
        //static attribute and method a static inner class done not have access to the member of outer class
        OuterClass.InnerClass  in = new OuterClass.InnerClass();
        System.out.println(in.y);
        System.out.println(ot.x);
    }
}