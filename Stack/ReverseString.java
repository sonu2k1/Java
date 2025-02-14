import java.util.Stack;

public class ReverseString {
    public static String reversestring(String str){
        Stack<Character> s = new Stack <>();
        int idx =0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }  
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    // public static boolean palindrome(String str, String result){
    //     if(result == str){
    //         return true;
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        String str = "ana";
        String result = reversestring(str);
        System.out.println(result);
        // System.out.println(palindrome(str , result));
        
    }
}
