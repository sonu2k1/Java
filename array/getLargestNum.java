public class getLargestNum {
    public static void main(String[] args){
        int arr[] = {1,23,43,56,77,88,99};
        System.out.println("Largest numbar is = "+ getLargestNum(arr));
        System.out.println("Smallest numbar is = "+ getSmallestNum(arr));

    }

    public static int getSmallestNum(int arr[]){
       int smallest = Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
        if(smallest > arr[i]){
            smallest= arr[i];
        }
    }
    return smallest;
      }

    public static int getLargestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
