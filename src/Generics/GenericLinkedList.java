package Generics;

class ListNode<T> {
    T data;
    ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class GenericLinkedList<T> {
    ListNode<T> head;
    ListNode<T> tail;
    int size;

    public GenericLinkedList(){
        head=null;
        size = 0;
    }

    // TODO: Create and initialize the head to null in the constructor
    public void add(T val) {
        var node = new ListNode<T>(val);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }

    public void display() {
        var temp = head;
        while(temp !=null){
            System.out.print(temp.data);
            System.out.print(" ");
            temp = temp.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }
}
