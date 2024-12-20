package Collections;

import java.util.LinkedList;

public class RecentlyUsedItems {
    private final LinkedList<Item> recentlyUsedItems;
    private final int limit;
    public RecentlyUsedItems(int limit) {
        recentlyUsedItems = new LinkedList<>();
        this.limit = limit;
    }

    public void setRecentlyUsedItems(Item item) {
        recentlyUsedItems.remove(item);
        recentlyUsedItems.addFirst(item);
        if(recentlyUsedItems.size() > limit){
            recentlyUsedItems.removeLast();
        }
    }

    public LinkedList<Item> getRecentlyUsedItems() {
        return recentlyUsedItems;
    }
}
