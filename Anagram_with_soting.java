import java.util.*;

public class Anagram_with_soting.java
{
    public static String sort(String str)
    {
        char ch[] = str.toCharArray();      // convert in character
        Arrays.sort(ch);                    // sorting in Character wise
        return new String(ch);              // return in String
    }
    
    
	public static void main(String[] args) {
	    String s = "abcb";
	    String s1 = "bcbda";
	    String os = sort(s);
	    String so = sort(s1);
	    if(os.equals(so))
	    System.out.println("Anagrams");
	    
	    else
	    System.out.println("Not Anagrams");
	} 
}
