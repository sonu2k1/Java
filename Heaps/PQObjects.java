package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

import Heaps.PQObjects.Student;

public class PQObjects {
    static class Student implements Comparable<Student> {
          String name;
          int rank;

         public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
         }

         @Override
         public int compareTo(Student s2){
            return this.rank - s2.rank;
         }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(); // Ascending order
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  //Descending order

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12)); 

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name +" -> "+ pq.peek().rank); //O(n)
            pq.remove(); //O(log n)
        }
    }
}
