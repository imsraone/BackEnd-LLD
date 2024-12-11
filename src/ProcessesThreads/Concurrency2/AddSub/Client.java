package ProcessesThreads.Concurrency2.AddSub;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var executeService = Executors.newCachedThreadPool();
        var val = new Value();
        val.value = 5;
        Future<Void> add = executeService.submit(new Adder(val));
        Future<Void> sub = executeService.submit(new Subtractor(val));
        add.get();
        sub.get();
        System.out.println(val.value);
    }
}
