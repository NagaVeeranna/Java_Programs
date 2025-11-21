class SharedBuffer {
    private final int[] buffer;
    private int count, in, out;
    private final int size;

    public SharedBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        count = in = out = 0;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (count == size) {
            wait(); 
        }
        buffer[in] = item;
        in = (in + 1) % size;
        count++;
        System.out.println("Produced: " + item);
        notifyAll(); 
    }

    public synchronized int consume() throws InterruptedException {
        while (count == 0) {
            wait(); 
        }
        int item = buffer[out];
        out = (out + 1) % size;
        count--;
        System.out.println("Consumed: " + item);
        notifyAll(); 
        return item;
    }
}

class Producer implements Runnable {
    private final SharedBuffer buffer;
    private final int maxItems;

    public Producer(SharedBuffer buffer, int maxItems) {
        this.buffer = buffer;
        this.maxItems = maxItems;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < maxItems; i++) {
                buffer.produce(i);
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(150); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerEx {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);
        Producer producer = new Producer(buffer, 10);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
        
        try {
            producerThread.join();
            consumerThread.interrupt(); 
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Production and Consumption completed.");
    }
}
