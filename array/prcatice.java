package array;
import java.util.*;

public class prcatice {
    public static void main(String[] args){
        int n=5;
      for(int i=0;i<n;i++){
        // System.out.println(i);

        for(int j=n-i;j>0;j--){
        //    System.out.print(j);
           System.out.print(" ");
        }

        for(int j=0;j<=i;j++){
        System.out.print("*");
        }

        System.out.println();
      }
    }
}
