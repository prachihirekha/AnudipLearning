package workspace.execptionhandling;

import java.io.IOException;

// if a method is capable tof throwing an excpetion that it coubld not handle,
// then it shoulb specify that excpetion using throws keyword.
// it helps the callers of that method in hadling that exception
public class ThrowsDemo {
    void method1()throws IOException {// throwing a class
     throw new IOException("some divice error");
    }
    void method2() throws IOException {

            method1();

    }
    void method3(){
          try {
              method2();
          }catch (IOException e){
              System.out.println(" handle huaaaa");
          }
    }

    public static void main(String[] args) {
        ThrowsDemo ts = new ThrowsDemo();
        ts.method3();
    }
}
