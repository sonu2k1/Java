package Queue;

import java.util.*;

// Doubly Ended Queue
public class UseOfDeque {
    
    public static void main(String[] args) {
        UseOfDeque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addFirst(4);
    
        System.out.println(deque);
    }
}
