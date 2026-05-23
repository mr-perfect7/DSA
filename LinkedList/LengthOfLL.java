package LinkedList;
public class LengthOfLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;
        
        Node temp = a;
        int length = 0;
        while (temp!=null) {
            temp = temp.next;
            length++;
        }
        System.out.println(length);
    }
}