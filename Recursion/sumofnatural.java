package Recursion;

public class sumofnatural {
    public static int sumofnatural(int n){
        if(n==1){
           // System.out.print(n);
            return 1;
        }

        int sum = n + sumofnatural(n-1);
        return sum;
    }
    public static void main(String[]args){
     System.out.println( sumofnatural(5));;
    }
}
