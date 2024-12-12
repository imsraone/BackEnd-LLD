package ProcessesThreads.Concurrency2.HomeWork;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var arrayCreator = new ArrayCreator(5);
        var executeService = Executors.newCachedThreadPool();
        Future<ArrayList<Integer>> arry = executeService.submit(arrayCreator);
        var response = arry.get();
        for(Integer i : response) {
            System.out.println(i);
        }
    }
}
