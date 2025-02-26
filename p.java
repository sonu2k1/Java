

// public class p {

//     public static void main(String[] args){
//         int i, j,n=5;

//         for (i = n-1; i > 0; i--) {
//             // inner loop to print spaces.
//             for (j = n - i; j > 1; j--) {
//                 System.out.print(" ");
//             }

//             // inner loop to print stars.
//             for (j = 0; j <= i; j++) {
            
//                 System.out.print("* ");
//             }

//             // printing new line for each row
//             System.out.println();
//         }
//         // outer loop to handle rows
//         // for (i = 0; i < n; i++) {
//         //     // inner loop to print spaces.
//         //     for (j = n - i; j > 1; j--) {
//         //         System.out.print(" ");
//         //     }

//         //     // inner loop to print stars.
//         //     for (j = 0; j <= i; j++) {
//         //         System.out.print("* ");
//         //     }

//         //     // printing new line for each row
//         //     System.out.println();
//         // }
//     }

//    // public static void java(String str){
//     //    int sum = a+b;
//     //     System.out.println(sum);
//     // for(int i=3;i>=0;i--){
//     //     System.out.print(str.charAt(i));
//     // }

//   //  int rev = str

//     //}
//    // public static void main(String args[]){
//     //   for(int i=0;i<=5;i++){
//     //     System.out.print(i);
//     //     for(int j=i;j<=5;j++){
//     //         System.out.println(j);
//     //     }
       
//     //   }
//    // System.out.println( java(1,2));

// //    int arr[] = {1,2,3,4};
//     //  String str = "abcd";
//     //  java(str);
//   //  }
// }

public class p {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int totalRows = 7; // Total number of rows in the pattern

        // Upper part of the pattern
        for (int i = 0; i < totalRows / 2; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 0; j < totalRows - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

            System.out.println("   *");

        // Lower part of the pattern
        for (int i = 1; i <= totalRows / 2; i++) {
            // Print leading spaces
            for (int j = 0; j < totalRows / 2 - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}