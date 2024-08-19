import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        // SImple Star Pattern
    //     for (int i = 1; i <= 4; i++) {
    //         for (int j = 1; j <= i; j++) {
    //               System.out.print("*");
    //         }
    //         System.out.println( );
    //     }

     //Inverted star 
    //  Scanner sc = new Scanner(System.in);
    //  int n =sc.nextInt();
    //  for (int i = 1; i <= n; i++) {
    //     for (int j = 1; j <=n-i+1; j++) {
    //           System.out.print("*");
    //     }
    //     System.out.println( );
    // }

    ////Half Pyramid

    // for (int line = 1; line <= 4; line++) {
    //            for (int number = 1; number <= line; number++) {
    //                    System.out.print(number);
    //              }
    //              System.out.println( );
    //          }
    
             ////Character Pattern
             char ch ='A';
             for (int i = 1; i <= 4; i++) {
                     for (int j = 1; j <= i; j++) {
                              System.out.print(ch);
                              ch++;
                        }
                        System.out.println( );
                    }
            


    }
}
