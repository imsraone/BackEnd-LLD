package Collections;

import java.util.*;

public class GenericInventoryManagement <T extends Item>{
    private final HashMap<String, T> inventory;
    private final RecentlyUsedItems recentlyUsedItems;
    public GenericInventoryManagement() {
        inventory = new HashMap<>();
        recentlyUsedItems = new RecentlyUsedItems(10);
    }
    public void add(T item){
        if(!inventory.containsKey(item.getName())){
            inventory.put(item.getId(), item);
        }else{
            throw new IllegalArgumentException("Item already exists");
        }
    }
    public void remove(String id){
        if (inventory.containsKey(id)){
            inventory.remove(id);
        }else{
            throw new NoSuchElementException("Item not found to delete from the inventory");
        }
    }
    public T get(String id){
        if(inventory.containsKey(id)){
            recentlyUsedItems.setRecentlyUsedItems(inventory.get(id));
            return inventory.get(id);
        }else{
            throw new NoSuchElementException("Item not found, please add it to the inventory");
        }
    }
    public Collection<T> getAllItems(){
        if(inventory.isEmpty()){
            throw new NoSuchElementException("Inventory is empty, Please check your inventory");
        }else{
            return inventory.values();
        }
    }

    public List<Item> getRecentlyUsedItems() {
        return recentlyUsedItems.getRecentlyUsedItems().stream().toList();
    }
}
