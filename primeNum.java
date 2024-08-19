import java.util.*;

public class primeNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     

        // if(n==2){
        //     System.out.println(" 2 is a Prime Number");
        // }
        // else{
        //     boolean isPrime = true;
        //     for(int i=2;i<=Math.sqrt(n);i++){
        //        if(n%i==0){
        //          isPrime=false;
        //        }
        //     }
        //     if(isPrime == true){
        //         System.out.println(n+ "is prime number");
        //     }
        //     else{
        //         System.out.println("Composite Number ");
        //     }
        // }

        if(n==2){
            System.out.println(" 2 is a Prime Number");
        }
        else{
            boolean isPrime = true;
            for(int i=2;i<=n-1;i++){
               if(n%i==0){
                 isPrime=false;
               }
            }
            if(isPrime == true){
                System.out.println(n + " is prime number");
            }
            else{
                System.out.println(n +" is Composite Number ");
            }
        }
      
    }
   
    
}
