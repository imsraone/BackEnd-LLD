package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Clothing("1","Reddy",100,12,"20"));
        list.add(new Clothing("1","Sravan",100,12,"10"));
        list.add(new Clothing("1","Kumar",100,12,"10"));
        list.add(new Electronics("1","Kumar",100,12,2025));
        System.out.println("Before sorting:");
        for (var item : list) {
            System.out.println(item.getName());
        }
        System.out.println("After sorting:");
        list.sort(Comparator.comparing(Item::getName));
        for (var item : list) {
            System.out.println(item.getName());
        }
    }
}
