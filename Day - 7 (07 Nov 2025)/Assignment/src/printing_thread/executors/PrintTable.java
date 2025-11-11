package printing_thread.executors;

public class PrintTable implements Runnable {
    private final int number;
    private final Object lock;
    private final int taskIndex;
    private final int totalTasks;
    private static int turn = 0; // shared turn among all tasks

    public PrintTable(int number, Object lock, int taskIndex, int totalTasks) {
        this.number = number;
        this.lock = lock;
        this.taskIndex = taskIndex;
        this.totalTasks = totalTasks;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (lock) {
                while (turn != taskIndex) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.printf("\n[Task-%d] %d x %d = %d", taskIndex, number, i, number * i);

                // pass turn to the next task
                turn = (turn + 1) % totalTasks;
                lock.notifyAll();
            }
        }
    }
}
