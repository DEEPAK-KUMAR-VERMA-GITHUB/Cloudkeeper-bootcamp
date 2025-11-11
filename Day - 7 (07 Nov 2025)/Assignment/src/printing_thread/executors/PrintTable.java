package printing_thread.executors;

public class PrintTable implements Runnable {
    private int number;

    public PrintTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("\n%d x %d = %d", number, i, number * i);
        }
    }
}
