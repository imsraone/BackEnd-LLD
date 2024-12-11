package ProcessesThreads.Concurrency2;

public class NumberPrinter implements Runnable {
    int number;
    NumberPrinter(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println(number + " is printed" + Thread.currentThread().getName());
    }
}
