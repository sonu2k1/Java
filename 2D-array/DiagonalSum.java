public class DiagonalSum {

    public static int DiagonalSum(int matrix[][]){
        int sum=0;
    for(int i=0;i<matrix.length;i++){
      //Primary Diagonal
      sum+=matrix[i][i];
      //Seconday Diagonal
      if(i != matrix.length-1-i)
        sum+=matrix[i][matrix.length-i-1];
    }
     return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,1},
                          {1,9,4},
                           {2,3,1} };
        System.out.println( DiagonalSum(matrix));                
    }
}
