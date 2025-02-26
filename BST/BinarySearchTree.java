import java.util.*;
public class BinarySearchTree { //O(H)
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
        public static Node insert(Node root, int val){
           if (root == null) {
                root = new Node(val);
                return root;
           }
           if ( root.data > val) {
               //Left SubTree
                root.left = insert(root.left, val);
           }else{
               //Right SubTree
               root.right = insert(root.right, val);
           }
            return root;
        }

        public static void inorder(Node root){
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
// Searching
        public static boolean search(Node root, int val){ // O(H)
            if (root == null) {
                return false;
            }
    
            if (root.data == val) {
                return true;
            }
    
            if (root.data > val) {
                return search(root.left, val);
            }else{
                return search(root.right, val);
            }
        }

        // DElETION OF NODE
        public static Node delete(Node root, int val){
            // if (root == null) {
            //     return null;
            // }

            if (root.data < val) {
                root.right = delete(root.right, val);
            }

            if(root.data > val){
                root.left = delete(root.left, val);
            }else{
                // Case -1 : Leaf Node - No Child
                if(root.left == null && root.right == null){
                    return null;
                }
                // Case -2 : Single Child
                if (root.left == null) {
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }

                // Case -3 : Two Chlidren
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
            return root;
        }

        public static Node findInorderSuccessor(Node root){
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }

        //Print In Range
        public static void printInRange(Node root, int k1, int k2){
            if (root == null) {
                return;
            }
            if (root.data >= k1 && root.data <= k2) {
                printInRange(root.left, k1, k2);
                System.out.print(root.data+" ");
                printInRange(root.right, k1, k2);
            }else if(root.data < k1){
                printInRange(root.left, k1, k2);
            }else{
                printInRange(root.right, k1, k2);
            }
        }

        public static void printPath(ArrayList<Integer> path){
              for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i)+"->");
              }
              System.out.println("Null");
        }

        public static void printRoot2leaf(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }
            path.add(root.data);
            if(root.left == null && root.right == null){
                printPath(path);
            }
            printRoot2leaf(root.left, path);
            printRoot2leaf(root.right, path);
            path.remove(path.size()-1);

        }

        // VALID BST
        public static boolean isValidBST(Node root, Node min, Node max){
            if (root == null) {
                return true;
            }
            if (min != null && root.data <= min.data) {
                return false;
            }else if(max !=  null && root.data >= max.data){
                return false;
            }
            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
        }
        public static void main(String[] args) {
            // int values[] = {5,1,3,4,2,7};
            // int values[] ={8,5,3,1,4,6,10,11,14};
            int values[] ={1,1,1};
            Node root = null;

            for(int i=0; i<values.length; i++){
                root = insert(root, values[i]);

            }
            inorder(root);
            System.out.println();

            // if (search(root, 1)) {
            //     System.out.println("Found");
            // }else{
            //     System.out.println("Not Found");
            // }

        //  root = delete(root, 1);
        //  inorder(root);
        //  System.out.println();
        // printInRange(root, 5, 12);

            // printRoot2leaf(root, new ArrayList<>());

            if (isValidBST(root , null, null)) {
                System.out.println("Valid BST");
            }else{
                System.out.println("Not Valid BST");
            }
        }
    }

