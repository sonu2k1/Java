package Sorting;
import java.util.*;

public class InsertionSort {

    public static void InsertionSort(int arr[]){
       for(int i=1;i<arr.length;i++){
        int curr = arr[i];
        int prev =i-1;
        while(prev >=0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = curr;
       }
    }

    public static void printSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       // System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,3,1,4,2};
       // InsertionSort(arr);
       Arrays.sort(arr);
        printSort(arr);


    }
    
}
