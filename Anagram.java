import java.io.*;
import java.util.*;

public class Anagram {
    
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().toUpperCase();
        String s2 = s.nextLine().toUpperCase();
        
        boolean flag = true;
            Map<Character,Integer> map = new HashMap<>();
            Map<Character,Integer> map1 = new HashMap<>();
            if(s1.length()!=s2.length()){
                System.out.println("Not Anagrams");
                return;
            }
            for(char c: s1.toCharArray())
            {
                if(map.containsKey(c))
                {
                    map.put(c,map.get(c)+1);
                }
                else
                {
                    map.put(c,1);
                }
            }
            for(char c1: s2.toCharArray())
            {
                if(map1.containsKey(c1))
                {
                    map1.put(c1,map1.get(c1)+1);
                }
                else
                {
                    map1.put(c1,1);
                }
            }
            for(char ch : map.keySet())
            {
                if( map.get(ch)!= map1.get(ch))
                {
                    System.out.println("Not Anagrams");
                    flag = false;
                    break;
                }
            }
            if(flag)
            System.out.println("Anagrams");
        
        
    }
}
