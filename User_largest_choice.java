import java.util.*;
class User_largest_choice{
   public static void main(String[] args) {
		int[] arr = {11,72,80,12,40,84,97,75,33,34};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();                      // user enter which largest no. they want to see 
		Arrays.sort(arr);                          // it's sorting
        int a = arr.length;                    // find length
        System.out.println(arr[a-k]);          // length - user input 
	
}
}