package AccessModifiersConstructor;

public class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    public Node(Node next) {
        this.data = next.data;
        if(next.next != null) {
            this.next = new Node(next.next);
        }
    }
}
