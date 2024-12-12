package ProcessesThreads.Concurrency2.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    public List<Integer> input;
    public ExecutorService executor;
    public MergeSort(List<Integer> input, ExecutorService executor) {
        this.input = input;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        // divide array into two equal parts
        if(input.size() <= 1)
            return input;
        int size = this.input.size();
        int middle = size / 2;
        List<Integer> leftSubArray = this.input.subList(0, middle);
        List<Integer> rightSubArray = this.input.subList(middle, size);

        var leftArrayObj = new MergeSort(leftSubArray, executor);
        var rightArrayObj = new MergeSort(rightSubArray, executor);
        Future<List<Integer>> leftArrayFuture = executor.submit(leftArrayObj);
        Future<List<Integer>> rightArrayFuture = executor.submit(rightArrayObj);
        var leftArray = leftArrayFuture.get();
        var rightArray = rightArrayFuture.get();

        int i = 0;
        int j = 0;
        var result = new ArrayList<Integer>();
        while (i < leftArray.size() && j < rightArray.size()) {
            if (leftArray.get(i) < rightArray.get(j)) {
                result.add(leftArray.get(i));
                i++;
            }else{
                result.add(rightArray.get(j));
                j++;
            }
        }
        while (i < leftArray.size()) {
            result.add(leftArray.get(i));
            i++;
        }
        while (j < rightArray.size()) {
            result.add(rightArray.get(j));
            j++;
        }
        return result;
    }
}
