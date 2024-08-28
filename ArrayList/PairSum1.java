package ArrayList;
import java.util.*;

public class PairSum1 {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int lp=0;
        int rp = list.size()-1;
         while(lp != rp){
            if(list.get(rp)+list.get(lp) == target){
                return true;
            }
            if(list.get(rp)+list.get(lp) < target){
                lp++;
            }else{
                rp--;
            }
         }
         return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 50;
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
       
         System.out.println(pairSum1(list, target));
    }
}
