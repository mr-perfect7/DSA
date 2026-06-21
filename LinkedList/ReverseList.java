package LinkedList;

public class ReverseList {

    // Node class (custom linked list)
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // display function
    public static void disp(Node head) {
        if(head == null) return;
        System.out.print(head.val+"->");
        if(head.next == null) System.out.println("Null");
        disp(head.next);
    }

    public static void main(String[] args) {

        // manually creating linked list
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        disp(head);
    }
}