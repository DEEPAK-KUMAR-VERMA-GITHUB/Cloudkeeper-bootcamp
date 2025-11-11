package printing_thread.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPrintMain {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        service.submit(new PrintTable(2));
        service.submit(new PrintTable(4));

        service.shutdown();

    }
}
