import java.io.*;
import java.util.*;

public class String_reverse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        boolean flag = true;
        List<Character> lst = new ArrayList<Character>();
        char[] ch = s1.toCharArray();
        int l = ch.length;
        int t = l-1;
        for(int i=t;i>=0;i--)
        {
            lst.add(ch[i]);
        }
        for(int i=0;i<l;i++)
        {
            if(lst.get(i)==ch[i])
            {
                continue;
            }
            flag = false;
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}