import java.io.*;
import java.util.*;

public class End_of_file {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int i=1;
        while(s.hasNext())
        {
            String s1 = s.nextLine();
            System.out.println(i++ + " " + s1);
        }
		
    }
}