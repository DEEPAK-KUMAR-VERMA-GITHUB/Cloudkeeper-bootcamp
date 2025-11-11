package printing_thread.thread_class;

public class PrintThread extends Thread{
    private int number;

    public PrintThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("\n%d x %d = %d", number, i, number * i);
        }
    }
}
