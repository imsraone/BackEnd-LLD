package ProcessesThreads;

public class Client {
    public static void main(String[] args) {
        var hw = new HelloWorldPrint();
        Thread thread = new Thread(hw);
        thread.start();
        hw.run();
        System.out.println("Main thread started in "+ Thread.currentThread().getName());

        for(int i=0; i<=100;i++){
            var np = new NumberPrinter(i);
            Thread thread2 = new Thread(np);
            thread2.start();
        }
    }
}
