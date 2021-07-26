class Largest_find.java{
   public static void main(String[] args) {
		int[] arr = {11,72,80,12,40,84,97,75,33,34};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		    if(first<arr[i])
            {
                third = second;
                second = first;
                first = arr[i];
            }

            else if(arr[i]<first && arr[i]>second)            // else if(arr[i]<first && arr[i]<second && arr[i]>third){third=arr[i];} third largest find
            {
                third = second;
                second = arr[i];
            }
		}
        System.out.println(first + ", " + second + ", "+ third);
	
}
}