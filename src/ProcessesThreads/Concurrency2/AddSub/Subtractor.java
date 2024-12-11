package ProcessesThreads.Concurrency2.AddSub;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    public Value value;
    public Subtractor(Value val) {
        this.value = val;
    }
    public Void call() {
        for (int i = 0; i <= 10000; i++) {
            this.value.value -= i;
        }
        return null;
    }
}
