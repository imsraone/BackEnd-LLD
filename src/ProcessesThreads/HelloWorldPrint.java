package ProcessesThreads;

public class HelloWorldPrint implements Runnable {
    public void run() {
        printHelloWorld();
    }

    void printHelloWorld() {
        System.out.println("Hello World printed from "+ Thread.currentThread().getName());
    }
}
