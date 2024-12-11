package ProcessesThreads.Concurrency2.Sort;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<int[]> {
    public int[] input;
    public ExecutorService executor;
    public MergeSort(int[] input, ExecutorService executer) {
        this.input = input;
        this.executor = executer;
    }

    @Override
    public int[] call() throws Exception {
        var leftArray = new MergeSort(input, this.executor);
        var rightArray = new MergeSort(input, this.executor);
        Future<int[]> leftArrayFuture = executor.submit(leftArray);
        Future<int[]> rightArrayFuture = executor.submit(rightArray);
        var leftSortedArray = leftArrayFuture.get();
        var rightSortedArray = rightArrayFuture.get();
        return mergeArrays(leftSortedArray, rightSortedArray);
    }

    public int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Traverse arr1 and insert its elements into arr3
        while (i < n1) {
            arr3[k++] = arr1[i++];
        }

        // Traverse arr2 and insert its elements into arr3
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }

        // Sort the entire arr3
        Arrays.sort(arr3);
        return arr3;
    }
}
