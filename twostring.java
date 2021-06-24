import java.util.*;
class Main
{
    static String S(String s3,String s4)
    {
        Set<Character> set = new HashSet<Character>();
        for(char c:s3.toCharArray())
        {
            set.add(c);
        }
        
        for(char c:s4.toCharArray())
        {
           if(set.contains(c))
           return "YES";
        }
        
        return "NO";
    }
    
    public static void main(String[] args)
    {
        
        Scanner st= new Scanner(System.in);
        int n = st.nextInt();
        for(int i=0;i<n;i++)
        {
            String s1 = st.nextLine();
            String s2 = st.nextLine();
            
            System.out.println(S(s1,s2));
        }
    }
}
