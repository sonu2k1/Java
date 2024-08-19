package Recursion;

public class xPowN {
    
    public static int xPowN(int x, int n){
        if(n==0){
            return 1;
        }
        int xmn1 = xPowN(x, n-1);
        int xn = x*xmn1;
        return xn;
    }

    public static int OptmizedxPowN(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = OptmizedxPowN(x, n/2);
        int halfPowerSq = halfPower * halfPower;
         if(n%2 != 0){
             halfPowerSq = x * halfPowerSq;
         }

         return halfPowerSq;
    }


    public static void main(String[] args) {
        //System.out.println(xPowN(2, 03));
        System.out.println(OptmizedxPowN(2,3));
    }
}
