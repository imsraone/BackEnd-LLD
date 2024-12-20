package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor{
    private final Queue<Order> queue;
    public OrderProcessor() {
        queue = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        queue.add(order);
    }

    public Order processOrder(){
        return queue.poll();
    }

    public int getOrderCount() {
        return queue.size();
    }
}
