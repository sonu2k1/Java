package ArrayList;

import java.util.*;

public class reverse {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(4);
  
           Collections.sort(list); // Ascending order
           System.out.println(list);
           Collections.sort(list, Collections.reverseOrder()); //Decending
        System.out.print(list);

        // for(int i=list.size()-1;i>=0;i--){
        //      System.out.print(list.get(i)+" ");
        // }
      
           System.out.println();

        ArrayList<String> str = new ArrayList<>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");

        Collections.sort(str); // Ascending order
        System.out.println(str);
        Collections.sort(str, Collections.reverseOrder()); //Decending
        System.out.println(str);

    //     for(int i=str.size()-1;i>=0;i--){
    //         System.out.print(str.get(i)+" ");
    //    }

    }
}
