public class Implementation {
    public static int size=0;
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
        }
    }
    //Dispaying all the elements
    public static void display(Node root){
        if (root ==  null) {
            return;
        }
        System.out.print(root.data+"->");
        if(root.left != null )System.out.print(root.left.data+",");
        if(root.right != null )System.out.print(root.right.data);
        System.out.println();
        display(root.left);
        display(root.right);
        
    }
    //Size of Binary tree
    public static int sizeOfBinaryTree(Node root){
        if (root == null) {
            return 0;
        }
        return sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right)+1;
    }
    //Preorder tarversal
    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        size++;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    } 
    //SUM OF NODES
    public static int sumNodes(Node root){
        if(root == null){
            return 0;
        }
        return root.data+sumNodes(root.left)+sumNodes(root.right);
    }
    //MAX VALUE
    public static int maxOfNodes(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(Math.max(root.data,maxOfNodes(root.left)),maxOfNodes(root.right));
    }
    //Height
    public static int heightTree(Node root){
        if (root == null ) {
            return 0;
        }
        //agar edge based 
        // if (root.left==null && root.right==null) {
        //     return 0;
        // }

        return 1+ Math.max(heightTree(root.left),heightTree(root.right));
    }
    public static void main(String[] args) {
        Node  root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        System.out.println("-----NODES----");
        display(root);
        System.out.println("------PreOrder-----");
        preOrder(root);
        System.out.println("SIZE = "+sizeOfBinaryTree(root));
        System.out.println("SUM of nodes = "+sumNodes(root));
        System.out.println("MAX of nodes = "+maxOfNodes(root));
        System.out.println("HEIGHT = "+heightTree(root));
    }
}
