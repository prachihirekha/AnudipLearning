package workspace.inner_class;
class OuterClass1 {
    int x = 10;

    class InnerClass {
        public int innerMethod() {
            return x;
        }
    }
}
public class MainDemo1 {
        public static void main(String[] args) {
            OuterClass1 ot = new OuterClass1();
            OuterClass1.InnerClass in = ot.new InnerClass();
            System.out.println(in.innerMethod());
        }
}
