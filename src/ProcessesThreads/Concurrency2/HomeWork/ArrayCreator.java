package ProcessesThreads.Concurrency2.HomeWork;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    public int number;
    public ArrayCreator(int n) {
        this.number = n;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        var result = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
            result.add(i);
        }
        return result;
    }
}
