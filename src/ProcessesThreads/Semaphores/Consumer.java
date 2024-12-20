package ProcessesThreads.Semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    private Semaphore consumerSemaphore;
    private Semaphore producerSemaphore;
    public Consumer(Store store, Semaphore consumerSemaphore, Semaphore producerSemaphore) {
        this.store = store;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumerSemaphore.acquire();
                store.removeItem();
                producerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
