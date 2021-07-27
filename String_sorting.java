import java.util.*;

public class Main
{
    public static String sort(String str)
    {
        char ch[] = str.toCharArray();      // convert in character
        Arrays.sort(ch);                    // sorting in Character wise
        return new String(ch);              // return in String
    }
    
    
	public static void main(String[] args) {
	    String s = "hello";
	   
		System.out.println(sort(s));
	} 
}
