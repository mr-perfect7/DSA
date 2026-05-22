class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
class BuildBinaryTree{
    int idx = -1;
    public Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
}
public class HeightOfTree {
    static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int treeHeight = Math.max(leftHeight,rightHeight)+1;
        return treeHeight;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildBinaryTree tree = new BuildBinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("Height of the tree: "+height(root));
    }
}
