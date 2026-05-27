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
        for(int i=1;i<size-n+1;i++){
            temp = temp.next;
        }
        return temp;
    }
    // Approach - 2(slow and fast pointer)
    public static Node NthNode2(Node head, int n){
        if(n<=0){
            throw new IllegalArgumentException("n Should be >0");
        }
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while (fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
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
            Node p = NthNode(a, 0);
            System.out.println("Normal approach: "+p.val);
            Node q = NthNode2(a, 0);
            System.out.println("Slow/fast pointer approach: "+q.val);
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
