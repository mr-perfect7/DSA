public class NthOrderTraversal {
   static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    private static void display(Node root, int n){
        if(root==null) return;
        if(n==1)System.out.print(root.val+" ");
        display(root.left, n-1);
        display(root.right, n-1);
    }
    private static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
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
        // e.left = f;
        // e.right = g;
        Node h = new Node(7);
        Node i = new Node(8);
        Node j = new Node(9);

        display(a, 1); 
    
    }
}
