package ProcessesThreads.HomeWork;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");
        Thread thread = new Thread(new Adder());
        thread.start();
        Thread thread1 = new Thread(new Subtractor());
        thread1.start();
    }
}
