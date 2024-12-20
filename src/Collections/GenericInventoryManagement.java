package Collections;

import java.util.*;

public class GenericInventoryManagement <T extends Item>{
    private HashMap<String, T> inventory;
    public GenericInventoryManagement() {
        inventory = new HashMap<>();
    }
    public void add(T item){
        inventory.put(item.getId(), item);
    }
    public void remove(String id){
        inventory.remove(id);
    }
    public T get(String id){
        return inventory.get(id);
    }
    public Collection<T> getAllItems(){
        return inventory.values();
    }
}
