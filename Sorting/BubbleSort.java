package Sorting;

public class BubbleSort {

    public static void BubbleSort(int arr[]){
        for(int i=0;i>arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                //Swap
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       // System.out.println();
    }
    public static void main(String[]args){
        int arr[]= {5,3,4,1,2};
        BubbleSort(arr);
        printSort(arr);
      
    }
    
}
