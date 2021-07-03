import java.util.*;
class Alternating_Characters{
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =0;
        s.nextLine();
        while(i<n)
        {
            int count=0;
            String s1 = s.nextLine();
            int l = s1.length();
   
            for(int j=0;j<l-1;j++)
            {
                char c = s1.charAt(j);
                char c1 = s1.charAt(j+1);
                if(c==c1)
                count++;
            }
            System.out.println(count);
            i++;
        }
        
    }
}
