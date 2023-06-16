class List {
    Node head;

    static class Node {
        int value;
        Node next;
    }

    public class

    void pushFront(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public static void popFront(){
        if(head != null){
            head = head.next;
        }
    }
}
