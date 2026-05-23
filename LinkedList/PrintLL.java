package LinkedList;

import LinkedList.BasicsLL.Node;
import LinkedList.LengthOfLL;

public class PrintLL {
    public static void print(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void printRec(Node head){
        Node temp = head;
        if(temp == null) return;
        System.out.println(temp.data);
        temp = temp.next;
        printRec(temp);
        
    }
}
