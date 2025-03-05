package HashMap;

import java.util.*;

import java.util.HashMap;

public class Anagram {

    public static boolean validAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Integer,  Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            int ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<t.length();i++){
            int ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch)==1) {
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map. isEmpty();
    }

    public static void main(String[] args) {
        String s ="race";
        String t = "rare";
        System.out.println(validAnagram(s, t));
    }
    
}
