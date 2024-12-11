package ProcessesThreads.Concurrency2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main thread started in "+ Thread.currentThread().getName());
//        var executeService = Executors.newFixedThreadPool(5);
//        for(int i=0; i<=100;i++){
//            var np = new NumberPrinter(i);
//            executeService.execute(np);
//        }
        var executeService1 = Executors.newFixedThreadPool(5);
        for(int i=0; i<=100;i++){
            var ng = new Numbergenerator(i);
            Future<Integer> no = executeService1.submit(ng);
            try {
                System.out.println(no.get().toString());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
