public class Practice {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+"->");
        if(root.left!=null)System.out.print(root.left.val+",");
        if(root.right!=null)System.out.println(root.right.val);
        System.out.println();

        display(root.left);
        display(root.right);
    }
    private static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    private static int nodeSum(Node root){
        if(root == null) return 0;
        return root.val + nodeSum(root.left) + nodeSum(root.right);
    }
    private static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left), max(root.right)));
    }
    private static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left), min(root.right)));
    }
    private static int prod(Node root){
        if(root == null) return 1;
        return root.val * prod(root.left) * prod(root.right);
    }
    private static int height(Node root){
        if(root.left ==null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
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

        display(a); 
        // System.out.println(size(a));
        // System.out.println(nodeSum(a));
        // System.out.println(max(a));
        // System.out.println(height(a));
        // System.out.println(min(a));
        System.out.println(prod(a));

    }
}
