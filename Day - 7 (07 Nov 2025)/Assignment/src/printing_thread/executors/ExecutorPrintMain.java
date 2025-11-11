package printing_thread.executors;

import printing_thread.thread_class.PrintThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPrintMain {
    public static void main(String[] args) {
        Object lock = new Object();

        int[] numbers = {2, 4};
        int totalTasks = numbers.length;
        try (ExecutorService service = Executors.newFixedThreadPool(2)) {

            for (int i = 0; i < totalTasks; i++) {
                service.submit(new PrintTable(numbers[i], lock, i, totalTasks));
            }

            service.shutdown();
        }
    }
}
