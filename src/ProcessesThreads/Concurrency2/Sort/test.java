package ProcessesThreads.Concurrency2.Sort;

import ProcessesThreads.Concurrency2.Numbergenerator;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main thread started in "+ Thread.currentThread().getName());
        var executeService = Executors.newCachedThreadPool();
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        Future<int[]> sortedArray = executeService.submit(new MergeSort(arr, executeService));
        var res = sortedArray.get();
    }
}
