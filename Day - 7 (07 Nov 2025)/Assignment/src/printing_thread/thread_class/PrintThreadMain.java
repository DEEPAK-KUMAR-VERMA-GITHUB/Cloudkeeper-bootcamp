package printing_thread.thread_class;

public class PrintThreadMain {
    public static void main(String[] args) {
        Object lock = new Object();

        int[] numbers = {2, 4};
        int totalThreads = numbers.length;

        System.out.println("Threads started printing alternately:");

        for (int i = 0; i < totalThreads; i++) {
            new PrintThread(numbers[i], lock, i, totalThreads).start();
        }
    }
}
