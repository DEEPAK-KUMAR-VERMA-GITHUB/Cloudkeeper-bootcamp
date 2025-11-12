package concurrency;

public class Consumer implements Runnable{

    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try{
            for (int i = 1; i <= 50; i++) {
                buffer.consume();
                Thread.sleep(150);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
