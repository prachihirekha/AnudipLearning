package labpr;

public class EvenOddPrinter implements Runnable {
    private final int limit;
    private final boolean isEven;
    private static volatile int number =1;
    private static final Object lock = new Object();

    public EvenOddPrinter(int limit, boolean isEven) {
        this.limit = limit;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        while (number<=limit){
            if(isEven && number %2==0 || (!isEven && number%2 !=0)){
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    lock.notify();// notify other thread are waiting on lock
                }
            }else {
                synchronized (lock){
                    try {
                        lock.wait();//wait for other thread to notify
                    } catch (InterruptedException e) {
                     e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int limit=20;
        Thread evenThread = new Thread(new EvenOddPrinter(limit,true),"Even Thread");
        Thread oddThread= new Thread(new EvenOddPrinter(limit,false),"odd thread");
        evenThread.start();
        oddThread.start();
    }

}
