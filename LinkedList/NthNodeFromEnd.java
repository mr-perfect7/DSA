package LinkedList;

public class NthNodeFromEnd {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node NthNode(Node head,int n){
        if(n<=0){
            throw new IllegalArgumentException("n nust be greater than 0");
        }
        Node temp = head;
        int size = 0;
        while (temp!=null) {
            temp = temp.next;
            size++;
        }
        if(size<n){
            throw new IllegalArgumentException("n should less than or equals to size");
        }
        temp = head;
        for(int i=0;i<size-n+1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        try {
            Node q = NthNode(e, 710);
            System.out.println(q.val);
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
