package Generics;

public class GenericPair<T, V> {
    T first;
    V second;

    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(V second) {
        this.second = second;
    }

    public static <S> void doSomething(S data){
        System.out.println(data);
    }

    public static <S> S returnSomething(S data){
        System.out.println(data);
        return data;
    }
}
