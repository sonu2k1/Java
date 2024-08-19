package array;
import java.util.*;

public class BinarySearch {

    public static int BinarySearch(int arr[], int key){
        int start=0,end= arr.length-1;
    
        while(start<=end){
           int mid=(start+end)/2;
    
           if(arr[mid]==key){
             return mid;
           }
           if(arr[mid]<key){
            start=mid+1;
           }
           else{
            end=mid-1;
           }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int arr[] = {1,4,5,7,9,11,22};
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the key: ");
         int key = sc.nextInt();

         System.out.print("key found at index: "+ BinarySearch(arr, key));

       
    }
}
