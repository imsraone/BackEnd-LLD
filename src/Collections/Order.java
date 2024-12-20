package Collections;

import java.util.PriorityQueue;

public class Order implements Comparable<Order>{
    private final String orderId;
    private final boolean isExpress;
    public Order(String orderId, boolean isExpress){
        this.orderId = orderId;
        this.isExpress = isExpress;
    }
    public String getOrderId(){
        return orderId;
    }
    public boolean isExpress(){
        return isExpress;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress == o.isExpress){
            return this.orderId.compareTo(o.orderId);
        }else if(this.isExpress){
            return -1;
        }
        return 1;
    }
}
