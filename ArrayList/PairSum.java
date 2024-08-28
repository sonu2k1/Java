
// FInd if any pair in a sorted & rotated ArrayList has a target sum.

package ArrayList;

import java.util.ArrayList;

public class PairSum {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){ //Breaking Point
                bp = i;
                break;
            }
        }
            int lp = bp+1;
            int rp = bp;

            while(lp != rp){
                if(list.get(rp)+list.get(lp) == target){
                    return true;
                }
                if(list.get(rp)+list.get(lp) < target){
                    lp = (lp+1)%n;
                }else{
                    rp = (n+rp-1) % n;
                }
             }
             return false;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 16;

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum2(list, target));
    }
}
