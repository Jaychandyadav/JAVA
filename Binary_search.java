import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first=0,last,mid,search;
		System.out.print("Enter the length of value: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Enter the searching element: ");
		search = s.nextInt();
		last = n-1;
		mid = first+last/2;
		while(first<=last)
		{
		    if(arr[mid]==search)
		    {
		        System.out.println(search + "is in index on " + mid);
		        break;
		    }
		    
		    else if(arr[mid]<search)
		    {
		        first = mid + 1;
		    }
		    
		    else
		    {
		        last = mid - 1;
		    }
		    mid = first + last/2;
		}
		if(first>last)
		{
		    System.out.print(search + "is not found in array");
		}
	}
}
