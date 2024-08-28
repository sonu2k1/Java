package LinkedList;

import java.util.*;

import ArrayList.reverse;

public class linkedlist {
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

    public void addFirst(int data){
        //step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }

        //step 2 = newNode next = head
        newNode.next = head;// link

        // step 3 = head = newNode
        head =  newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1;  temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(){     // For Printing the linkedlist.......
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("List is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("List is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev = size-2;
        Node prev = head;
        for(int i=0;i<size-2;i++){
           prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }

    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){ // key found
               return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // recursive search 
    public int recursiveSearch(int key){
        return helper(head, key);
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;

    }

    public void deleteNthformEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next; //remove first
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    // reverse the linkedlist
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Palindrom {Fast slow approach}

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrom(){
        if(head == null || head.next == null){
            return true;
        }
        //step-1:find mid
        Node midNode = findMid(head);

        //Step-2 : reverse half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head;
        //step-3 : compare left and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right =  right.next;
        }
        return true;
    }

    public boolean isCycle(){
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

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
    //    // ll.print();
    //     ll.addFirst(12);
    //    // ll.print();
    //     ll.addFirst(1);
    //    // ll.print();
    //     ll.addLast(3);
    //     //ll.print();
    //     ll.addLast(4);
    //     ll.addMiddle(2, 9);
    //     ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();

       // System.out.println(ll.size);
    //    System.out.println(ll.iterativeSearch(12));
    //    System.out.println(ll.iterativeSearch(112));
    //    System.out.println(ll.recursiveSearch(12));
    //    System.out.println(ll.recursiveSearch(112));

    // ll.reverse();
    // ll.print();
    // ll.deleteNthformEnd(3);
    // ll.print();

    // ll.addLast(1);
    // ll.addLast(2);
    // ll.addLast(2);
    // ll.addLast(1);
    
    // ll.print();
    // System.out.println( ll.checkPalindrom());

    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = head;

    System.out.println(isCycle());
}
}