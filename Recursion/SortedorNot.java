package Recursion;

public class SortedorNot {
  
    public static boolean SortedorNot(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return SortedorNot(arr, i+1);
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4};
         System.out.println(SortedorNot(arr, 0));
        
    }

}
