package printing_thread.thread_class;

public class PrintThread extends Thread{
    private final int number;
    private final Object lock;
    private final int threadIndex;
    private final int totalThreads;
    private static int turn;

    public PrintThread(int number, Object lock, int threadIndex, int totalThreads) {
        this.number = number;
        this.lock = lock;
        this.threadIndex = threadIndex;
        this.totalThreads = totalThreads;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (lock){
                while (turn != threadIndex){
                    try{
                        lock.wait();
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }

                System.out.printf("\n[Thread-%d] %d x %d = %d", threadIndex, number, i, number * i);

                // give chance to next thread
                turn = (turn + 1) % totalThreads;
                lock.notifyAll();
            }
        }
    }
}
