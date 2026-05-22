public class DiameterOfTree {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int idx = -1;
    Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
    static int height(Node root){
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int treeHeight = Math.max(leftHeight, rightHeight)+1;
        return treeHeight;
    }

    //O(n2) approach
    static int diaMeter(Node root){
        if (root == null) {
            return 0;
        }
        int d1 = diaMeter(root.left);
        int d2 = diaMeter(root.right);
        int d3 = height(root.left)+height(root.right) + 1;
        return Math.max(d1,Math.max(d2, d3));
    }
    //O(n) Approach
    static class TreeInfo{
        int h;
        int d;
        TreeInfo(int h, int d){
            this.h = h;
            this.d = d;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root == null){
           return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        
        int heightTree = Math.max(left.h, right.h)+1;

        int diam1 = left.d;
        int diam2 = right.d;
        int diam3 = left.h + right.h + 1;

        int diameterTree = Math.max(diam1,Math.max(diam2, diam3));
        TreeInfo Info = new TreeInfo(heightTree, diameterTree);
        return Info;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        DiameterOfTree dt = new DiameterOfTree();
        Node root = dt.buildTree(nodes);
        System.out.println("Diameter of the tree: "+diaMeter(root));
        System.out.println("Diameter of the tree(O(n)): "+diameter2(root).d);

    }
}
