public class factorial {

    public static int Factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f = f*i;

        }
        return f;

    }
    public static void main(String[] args){
          //int fact = Factorial(4);
          System.out.println(Factorial(4));
    }
    
}
