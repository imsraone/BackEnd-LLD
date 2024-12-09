package HomeWork;

public class Car implements Comparable<Car>{
    public int Price;
    public int Speed;
    @Override
    public int compareTo(Car o) {
        return Price - o.Price;
    }
}
