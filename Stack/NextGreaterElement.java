/*  
The Next greater element of some element x in an array is the 
 first greater element that is to the rightof x in the same array.
 */


package Stack;
import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int [arr.length];

        for(int i=arr.length-1; i>0 ; i--){
            // Step 1 - While Loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // Step 2- If-else condtion
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = s.peek();
            }

            // Step 3 - Push in s

            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
    
}

/*  for Left side -> change line no. 17 to--
   for(int i=0;i<arr.length-1;i++) */

/*
  Next smaller from right-hand side change line no. 19 to--
  while(!s.isEmpty() && arr[s.peek] >= arr[i])
 */

 /* Next smaller Left
  * for(int i=0;i<arr.length-1;i++) 
  while(!s.isEmpty() && arr[s.peek] >= arr[i])

  */