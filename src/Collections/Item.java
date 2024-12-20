package Collections;

public class Item {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
