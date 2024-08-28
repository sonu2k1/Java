package LinkedList;
import java.util.*;

//Floyad Cycle Finding Algorithum.

public class Cyclic {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
           this.data = data;
           this.next = null;
        } 
   }
   public static Node head;
   public static Node tail;
   public static int size;

   public static boolean isCycle(){
    Node fast = head;
    Node slow = head;

    while(fast != null && fast.next != null){
        slow = slow.next; //+1
        fast = fast.next.next; //+2
        if(slow == fast){
            return true; // Cycle exist
        }
    }
       return false;
}

    public static void removeCycle(){
        //Detect Cycle
        Node fast = head;
        Node slow = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast ==  slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
        return;
        }

        //Find Meeting point
        slow = head;
        Node prev = null; // last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle last.next -> null;
        prev.next = null;
    }
    

   public static void main(String args[]){
    // head = new Node(1);
    // Node temp = new Node(2);
    // head.next = temp;
    // head.next.next = new Node(3);
    // head.next.next.next = temp;

    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(3);
    head.next.next.next.next = head;
    
    System.out.println(isCycle());
   // removeCycle();
    System.out.println(isCycle());
   }
    
}
