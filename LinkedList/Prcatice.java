package LinkedList;

public class Prcatice {
    Node head = null;
    Node tail = null;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public void append(int n){
        Node temp = new Node(n);
        if(head==null){
            head = tail = temp;
        }else{
            tail.next = tail= temp;
        }
    }
    public int size(){
        int size = 0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            size++; 
        }
        return size;
    }
    public void deleteAt(int idx){
        if(head == null){
            return;
        }
        if(idx == 0 ){
            head = head.next;
            return;
        }else if(idx<0 || idx>size()){
            return;
        }

        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public Node nthNodeFromLast(int n){
        if(n<0 || n>size()){
            return null;
        }
        Node temp = head;
        for(int i=0;i<size()-n;i++){
            temp = temp.next;
        }
        return temp;
    }
    public void deleteNthFromEnd(int n){
        int size = size();
        if(n==size){
            head = head.next;
            return;
        }
        if(n<0 || n>size){
            System.out.println("Invalid index!");
            return;
        }
        Node temp = head;
        for(int i=0;i<size-n-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void delteNthFromEndSlowFast(int n){
        if(n<=0 || n>size()){
            System.out.println("Invalid index : "+n);
        }

        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return;
        }
        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    }
    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Prcatice ll = new Prcatice();
        ll.append(0);
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.display();
        System.out.println("\n SIZE : "+ll.size());
        // ll.deleteAt(40);
        // ll.display();
        // Node nth = ll.nthNodeFromLast(-9);
        // if(nth == null){
        //     System.out.println("NULL");
        // }else{
        //     System.out.println(nth.data);
        // }
        // ll.deleteNthFromEnd(4);
        ll.delteNthFromEndSlowFast(5);
        ll.display();
        System.out.println("\n SIZE : "+ll.size());

    }
}
