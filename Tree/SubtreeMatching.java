public class SubtreeMatching {
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
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
    boolean isSubtree(Node root, Node subRoot){
        if(root ==  null){
            return false;
        }
        if(subRoot == null){
            return true;
        }

    }
    public static void main(String[] args) {
        
    }
}
