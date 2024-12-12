package ProcessesThreads.Concurrency2.Sort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var executeService = Executors.newCachedThreadPool();
        var arr = List.of(1,9,2,8,0,3,4,5);
        var sorter = new MergeSort(arr, executeService);
        Future<List<Integer>> sortedArray = executeService.submit(sorter);
        var res = sortedArray.get();
        executeService.shutdown();
        System.out.println(res);
    }
}
