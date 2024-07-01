package workspace.multithreading;
import java.lang.Thread;
public class A  extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("prachi");
            try {//showing a sec time to take a thread
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
  class B{
    public static void main(String[] args) {
        A t = new A();
        t.start();// internally work run metho
        for(int i=1;i<=5;i++){
            System.out.println("prajwal");
            try {
                Thread.sleep(1000);// one one second interpution
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}


