public class SubtreeMatching {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    Node buildTree(int nodes[]) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    // MAIN FUNCTION
    boolean isSubtree(Node root, Node subRoot) {

        if (root == null) return false;
        if (subRoot == null) return true;

        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    // helper function
    boolean isSameTree(Node p, Node q) {

        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.data != q.data) return false;

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // You can test here
    }
}