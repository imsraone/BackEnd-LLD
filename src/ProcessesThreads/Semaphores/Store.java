package ProcessesThreads.Semaphores;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(maxSize);
    }

    public void addItem(Object item){
        System.out.println("Producer producing the item, items : "+ (items.size()+1));
        items.add(item);
    }
    public void removeItem(){
        System.out.println("Consumer consuming the item, items : "+ (items.size()-1));
        items.remove(items.getFirst());
    }
    public int getMaxSize(){
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }
}
