public class friendPair {
    public static int friendPair(int n){
        if(n==1 || n==2){
            return n;
        }
    // single
        int fnm1 = friendPair(n-1);
    // pair
        int fnm2 = friendPair(n-2);
       int pairs = (n-1)*fnm2;
    // Total Pairs
       int totalWays = fnm1+pairs;

       return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(friendPair(3));
    }
}
