public class SumOfAllNodes {
    public static class Node {
        int data;
        Node lNode,rNode;
        Node(int data){
            this.data = data;
            this.lNode = null;
            this.rNode = null;
        }
    }
    static int idx = -1;
    public static Node buildBinaryTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.lNode = buildBinaryTree(nodes);
        newNode.rNode = buildBinaryTree(nodes);
        return newNode;
    }
    public static int nodeSum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = nodeSum(root.lNode);
        int rightSum = nodeSum(root.rNode);

        return leftSum + rightSum + root.data;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildBinaryTree(nodes);
        System.out.println(root.data);
        int sum =nodeSum(root);
        System.out.println(sum);
    }
}
