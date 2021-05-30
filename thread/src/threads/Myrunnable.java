package threads;

public class Myrunnable implements Runnable {
    @Override
    public  void run() {
        System.out.println("name of thread :"+Thread.currentThread().getName());
        System.out.println("state of thread :"+Thread.currentThread().getState());
        System.out.println("ID of thread :"+Thread.currentThread().getId());
       // System.out.println("bye1");

    }
}
