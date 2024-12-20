package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        // MileStone 1
//        ArrayList<Item> list = new ArrayList<>();
//        list.add(new Clothing("1","Reddy",100,12,"20"));
//        list.add(new Clothing("2","Sravan",100,12,"10"));
//        list.add(new Clothing("3","Kumar",100,12,"10"));
//        list.add(new Electronics("4","Kumar",80,10,2025));
//        System.out.println("Before sorting:");
//        for (var item : list) {
//            System.out.println(item.getName() + " " + item.getId());
//        }
//        System.out.println("After sorting:");
//        //list.sort(Comparator.comparing(Item::getName));
//        Collections.sort(list);
//        for (var item : list) {
//            System.out.println(item.getName() + " " + item.getId());
//        }

        //Mile Stone 2
        var inventoryManagement = new GenericInventoryManagement<Item>();
        inventoryManagement.add(new Clothing("1","Reddy",100,12,"20"));
        inventoryManagement.add(new Clothing("2","Sravan",100,12,"10"));
        inventoryManagement.add(new Electronics("4","Kumar",80,10,2025));
        System.out.println("Before remove:");
        for (var item : inventoryManagement.getAllItems()) {
            System.out.println(item.getName() + " " + item.getId());
        }
        inventoryManagement.remove("2");
        System.out.println("After remove:");
        for (var item : inventoryManagement.getAllItems()) {
            System.out.println(item.getName() + " " + item.getId());
        }
    }
}
