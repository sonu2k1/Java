package BinaryTrees;

import java.util.*;

public class TreeTraversals { //O(n)
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
       if (root==null) {
          return 0;
       }

       int lh = height(root.left);
       int rh = height(root.right);
       return Math.max(lh, rh)+1;
    }

    // counting nodes
    public static int Count(Node root){
        if (root==null) {
           return 0;
        }
 
        int leftCount = Count(root.left);
        int rightCount = Count(root.right);
        return leftCount + rightCount + 1;
     }

     // Sum of all nodes
     public static int sum(Node root){
        if (root==null) {
           return 0;
        }
 
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum+rightSum+root.data;
     }

    static class BinaryTree {
         static int idx = -1;
         public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
         }

         public static void Preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
         }

         public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
         }

         public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
           
         }
        
         public static void levelOrder(Node root){
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
              
                if (currNode==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }

         }


    }
    public static void main(String[] args) {
        // int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        // tree.Preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelOrder(root);
        // System.out.println(height(root));

        /*
             1
            / \
           2   3
          / \ / \
         4  5 6  7
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
       // root.right.right.right = new Node(8);

        // System.out.println(Count(root));
        System.out.println(sum(root));
    } 
}
