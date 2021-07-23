import java.util.*;

public class Integer_length
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int loop = s.nextInt();
		
		
		for(int i=0;i<loop;i++)
		{
		System.out.print("Enter the search dight length no.: ");
		int n = s.nextInt();
		if(n<100000)
		{
		    if(n<10000)
		    {
		        if(n<1000)
		        {
		            if(n<100)
		            {
		                if(n<10)
		                {
		                    System.out.println("1");
		                }
		                else
		                {
		                    System.out.println("2");
		                }
		            }
		            
		            else
		            {
		                System.out.println("3");
		            }
		        }
		        else
		        {
		            System.out.println("4");
		        }
		    }
		    
		    else{
		        System.out.println("5");
		    }
		}
		else
		{
		    if(n<10000000)  //1cr.6
		    {
		        if(n<1000000) // 10lakh
		        {
		            System.out.println("6");
		        }
		        else{
		            System.out.println("7");
		        }
		    }
		    else
		    {
		        if(n<100000000)     //10cr. 9
		        {
		            System.out.println("8");
		        }
		        else{
		            System.out.println("It is greater than 10 cr.");
		        }
		    }
		}
		}
	}
}
