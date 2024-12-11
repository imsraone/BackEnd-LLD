package ProcessesThreads.Concurrency2;

import java.util.concurrent.Callable;

public class Numbergenerator implements Callable<Integer> {
    int number;
    public Numbergenerator(int number) {
        this.number = number;
    }
    @Override
    public Integer call() throws Exception {
        return this.number * 5;
    }
}
