import java.util.*;
class Prime
{
	public static void main(String[] args)
	{
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double num1 = Math.sqrt(num)+1;
		for(int i=2;i<=num1;i++)        //i<n  || i<n/2
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
			System.out.println("Prime");
		
		else
			System.out.println("Not Prime");
	}
}