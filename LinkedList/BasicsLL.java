package LinkedList;


public class BasicsLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data  = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(166);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node insert = new Node(100);
        c.next = insert;
        insert.next = d;
        // System.out.println(c.next.data);
        // Node temp = a;
        // while (temp!=null) {
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
        PrintLL.printRec(a);

    }
}
