public class SubArrays {
    public static void SubArrays(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
              
            int sum=arr[i]+arr[j]+arr[k];
    
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.err.print(arr[k]+" ");
                }
              ts++;
              System.out.println();
              
            }
           System.out.println();
           System.out.println(sum);
        }
        System.out.println("Total subarrays : "+ts);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7};
         SubArrays(arr);
    }
    
}
