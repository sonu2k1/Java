

public class bitwise {

    public static void OddorEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

    }

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }

    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
       
            return n | bitMask;
        

    }

    

    public static int clearIthBit2(int n, int i){
        int bitMask = ~(1<<i);
       
            return n & bitMask;
        

    }

    public static int clearIBit(int n, int i){
        int bitMask = ~(0)<<i;
       
            return n & bitMask;
        

    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit==0){
        //     return clearIthBit2(n, newBit);
        // }
        // else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit2(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    public static int clearBitsInRange(int n,int i,int j){
        int a = (~(0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;

    }
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }


    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n>0) {
            if((n&1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    

    public static void main(String[] args) {
       // int n=6;

        //OddorEven(n);
      
       System.out.println(fastExpo(5,3));;
      // System.out.println(setIthBit(6, 0));
    }
}
