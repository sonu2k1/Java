package Recursion;

public class Occurance {
    
    public static int FirstOccurance(int arr[], int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return FirstOccurance(arr, key, i+1);
    }

    public static int LastOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound= LastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(LastOccurance(arr, 5, 0));
    }
}


