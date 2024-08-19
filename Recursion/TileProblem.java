

public class TileProblem {

    public static int Tiles(int n){
        if(n==0 || n==1){
            return 1;
        }
         
        int nm1 = Tiles(n-1);
        int nm2 = Tiles(n-2);

        int total = nm1 + nm2;
         return total;
    }
    public static void main(String[] args) {
        System.out.println(Tiles(5));
    }
}
