public class PrimeFun {
    public static boolean Prime(int n){
        if(n == 2){
            return true;
        }

     for(int i=2;i<=Math.sqrt(n);i++){
        if(n % i==0){
            return false;
        }
     }
        return true;
    }
    //Range 
    public static void rangePrime(int n){
        for(int i=2;i<=n;i++){
            if(Prime(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args){

        //System.out.println(Prime(9));
        rangePrime(10);
    }
}
