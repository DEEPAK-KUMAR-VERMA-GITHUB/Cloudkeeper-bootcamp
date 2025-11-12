package concurrency;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
