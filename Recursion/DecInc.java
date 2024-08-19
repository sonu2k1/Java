package Recursion;

public class DecInc{

    public static void Decreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        Decreasing(n-1);
    }

    public static void Increasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        Increasing(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args){
      int n = 10;
      Decreasing(n);
      System.out.println();
      Increasing(n);
    }
    
}
