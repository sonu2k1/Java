import java.util.Scanner;

public class BinomialCofficent {

    public static int Fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
             f= f*i;
        }
        return f;
    }

    public static int binCoff(int n,int r){
        int fact_n = Fact(n);
        int fact_r = Fact(r);
        int nmr_fact = Fact(n-r);
         int binCoff = fact_n/(fact_r * nmr_fact);

         return binCoff;
    }

      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int r =sc.nextInt();
          
        
           System.out.println( binCoff(5,2));

      }   
}
