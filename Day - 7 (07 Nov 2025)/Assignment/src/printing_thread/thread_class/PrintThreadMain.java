package printing_thread.thread_class;

public class PrintThreadMain {
    public static void main(String[] args) {
        PrintThread t1 = new PrintThread(2);
        PrintThread t2 = new PrintThread(4);

        System.out.println("Thread 1 started printing");
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nThread 2 started printing");
        t2.start();


    }
}
