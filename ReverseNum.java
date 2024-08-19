import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    //    int i;
    //    for(int num=123;num>0;num/=10)
    //    {
    //     int lastDigit = num%10;
    //     System.out.print(lastDigit+ " ");
    //    }

    //  while(num > 0){
    //     int lastDigit = num % 10;
    //     System.out.print( lastDigit + " ");
    //     num /=10; // num= num /10;
    //  }
     int rev=0;
    while(num > 0){
        int lastDigit = num % 10;
        rev = (rev*10)+lastDigit;
        num /=10; // num= num /10;
     }
       System.out.print(rev);
    }
}
