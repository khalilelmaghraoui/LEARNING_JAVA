package threads;

public class Main extends Thread {

    public static void main(String[] args)  {
	// write your code here
   //   Threads threads  =new Threads();
    Thread threads = new Thread(new Myrunnable());
    Thread threads2 = new Thread(new Myrunnable());
        Threads threads1 = new Threads();
       // System.out.println("main thread"+currentThread().getName());


        threads.start();

      threads1.start();
       try {
           threads.join();
           threads1.join();
       }
       catch (Exception ignored){

       }
        System.out.println("outside");

    }
}
