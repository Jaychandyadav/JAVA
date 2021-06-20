import java.util.*;
class Collection
{
	public static void main(String[] args)
	{
		List<String> lst = new ArrayList<String>();
		lst.add("hello");
		lst.add("fello");
		lst.add("bye");
		lst.add("tata");
	
		System.out.println(lst);
		
		Collections.sort(lst);
		System.out.println(lst);
		
		int b = Collections.binarySearch(lst,"bye");    /*this search code is tell about of index of searching element */
		System.out.println(b);
		
		
		lst.add(0,"challo");               /* add means add in 0 index and traverse the data to ahead*/
		System.out.println(lst);
		
		lst.set(0,"nachallo");
		System.out.println(lst);          /* set directly change the value of position not travere the value of ahead befor data */
	
	    for(int i=0;i<lst.size();i++)    /* in array we use find length to use legth() but in List we use size() */
	    {
	        System.out.println(lst.get(i));  /* in array we use for print array data from this array name with index no.  but in List we use "get" for print the data and index no.  */
	    }
	}
}