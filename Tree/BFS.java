import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
   static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    private static void bfs(Node root){
        if(root == null) return;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (q.size()>0) {
            Node temp = q.peek();
            if(temp.left !=null) q.offer(temp.left);
            if(temp.right !=null) q.offer(temp.right);
            System.out.println(temp.val);      
            q.poll();      
        }

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(10);
        Node c = new Node(2);
        a.left = b;
        a.right = c;
        Node d = new Node(3);
        Node e = new Node(4);
        b.left = d;
        b.right = e;
        Node f = new Node(5);
        Node g = new Node(6);
        e.left = f;
        e.right = g;
        Node h = new Node(7);
        Node i = new Node(8);
        Node j = new Node(9);

        bfs(a); 
    
    }
}


