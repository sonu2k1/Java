package array;

public class Pairs {
    public static void Pairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of pair is: "+tp);
    }
    public static void main(String[]args){
        int arr[] ={2,4,6,8,10};
        Pairs(arr);
    }
    
}
