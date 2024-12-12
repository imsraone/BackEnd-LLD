package ProcessesThreads.Concurrency2.HomeWork;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    public Node root;
    public ExecutorService executor;
    public TreeSizeCalculator(Node root, ExecutorService executor) {
        this.root = root;
        this.executor = executor;
    }
    @Override
    public Integer call() throws Exception {
        if (root == null) {
            return 0;
        }
        var tc = new TreeSizeCalculator(root.left, executor);
        var tc2 = new TreeSizeCalculator(root.right, executor);
        Future<Integer> future = executor.submit(tc);
        Future<Integer> future2 = executor.submit(tc2);
        return Math.max(future.get(), future2.get()) + 1;
    }
}
