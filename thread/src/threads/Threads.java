package threads;

public class Threads extends Thread {
    @Override
    public void run() {

            System.out.println("name of thread (2) :"+Thread.currentThread().getName());
            System.out.println("State of thread(2) :"+Thread.currentThread().getState());
            System.out.println("ID of thread(2) :"+Thread.currentThread().getId());
       // System.out.println("bye2");

    }
}
