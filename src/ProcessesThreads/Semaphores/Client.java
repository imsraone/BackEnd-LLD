package ProcessesThreads.Semaphores;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        var store = new Store(5);
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);
        for (int i = 0; i < 10; i++) {
            Producer producer = new Producer(store, consumerSemaphore, producerSemaphore);
            new Thread(producer).start();
        }

        for (int i = 0; i < 10; i++) {
            Consumer consumer = new Consumer(store, consumerSemaphore, producerSemaphore);
            new Thread(consumer).start();
        }
    }
}
