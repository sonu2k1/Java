package array;
import java.util.*;

public class LinearSearch {
    public static int LinearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,7,3,0,9,8};

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt(); 

       // int key = 10;
        int index = LinearSearch(arr, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is at index :" + index);
        }

    }
}
