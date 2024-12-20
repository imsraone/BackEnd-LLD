package Generics;

public class Client {
    public static void main(String[] args) {
//        Pair pair = new Pair();
//        pair.setFirst(10);
//        pair.setSecond(20);
//        pair.setFirst("Sravan");
//
//        var genericPair = new GenericPair<String, Integer>();
//        genericPair.setFirst("Sravan");
//        genericPair.setSecond(5);
//
//        GenericPair.doSomething("Sravan");

        var data = GenericPair.returnSomething("Sravan");

        var gll = new GenericLinkedList<Integer>();
        gll.add(10);
        gll.add(30);
        System.out.println("Size : " + gll.size());
        gll.display();
    }
}
