package concurrency;

public class Producer implements Runnable{
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                buffer.produce(i);
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
