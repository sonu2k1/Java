import java.util.ArrayList;

public class BSTtoBalanced {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBalancedBST(ArrayList<Integer> inorder, int st, int ed) {
        if (st > ed) {
            return null;
        }
        int mid = (st + ed) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBalancedBST(inorder, st, mid - 1);
        root.right = createBalancedBST(inorder, mid + 1, ed);
        return root;
    }

    public static Node BSTtoBal(Node root) {
        // inorder seq - O(n)
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // sorted inorder seq - O(n)
        return createBalancedBST(inorder, 0, inorder.size() - 1);
    }

    public static void main(String[] args) {
        /*
                 8
               /   \
             6      10
            /        \
           5          11
          /             \
         3               12
         
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = BSTtoBal(root);
        preorder(root);
    }
}