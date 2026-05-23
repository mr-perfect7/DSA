package LinkedList;

public class ImplementationLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null,tail = null;
        public void append(int i) {
            Node temp = new Node(i);
            if(head == null){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        public void insertAtStart(int i){
            Node temp = new Node(i);
            if(head==null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }
        public void insertAt(int idx, int val){
            if(idx == 0) {
                insertAtStart(val);
                return;
            }else if(idx == size()){
                append(val);
                return;
            }else if(idx < 0 || idx > size()){
                System.out.println("Index "+idx+" is invalid!");
                return;
            }
            Node newNode = new Node(val);
            Node temp = head;
            int i = 1;
            while (i<idx) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(" | "+temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
        public int size(){
            Node temp = head;
            int length =0;
            while (temp!=null) {
                length++;
                temp = temp.next;
            }
            return length;
        }
        public int getValue(int idx) {
            if(idx<0){
                // throw new IndexOutOfBoundsException("Negative Index!");
                System.out.print("Invalid Index!");
                return -1;
            }
            Node temp = head;
            int i = 0;
            while (temp!=null) {
                if(i == idx){
                    return temp.data;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(0);
        ll.insertAtStart(11);
        ll.append(11);
        ll.insertAt(9, 100);
        ll.display();
        System.out.println("Length of LL : "+ll.size());
        System.out.println(ll.getValue(-2));
    }
}
