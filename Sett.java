import java.util.*;
public class Sett
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("Bye");
        set.add("Tata");
        set.add("Bye");
        
        // System.out.println(set.get(2));   // Won't work as set is not indexed
        
        System.out.println(set.isEmpty());
        
        // set.add(1,"java");    => Won't work as set is not indexed
        // set use for searching which complexity O(1) 
        
        System.out.println(set);
        
        for(String s:set)
        {
            System.out.println(s);
        }
    }
}
