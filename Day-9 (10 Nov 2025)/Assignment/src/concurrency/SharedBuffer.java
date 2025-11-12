package concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {

    private final Queue<Integer> buffer;
    private final int capacity;

    public SharedBuffer( int capacity ){
        this.capacity = capacity;
        buffer = new LinkedList<>();
    }

    public synchronized void produce(int value) throws InterruptedException {
        while(buffer.size() == capacity){
            wait();
        }

        buffer.add(value);
        System.out.println("Produced : " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException{
        while(buffer.isEmpty()){
            wait();
        }

        int value = buffer.poll();
        System.out.println("Consumed : " + value);
        notifyAll();

        return value;
    }

}
