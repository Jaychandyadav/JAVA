import java.util.*;

public class Main
{
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map = new HashMap();
        for(String str1: strs)
		{
		    char[] ch = str1.toCharArray();
		    Arrays.sort(ch);
		    String str2 = new String(ch);
		    if(!map.containsKey(str2))
		    {
		        map.put(str2,new ArrayList());      // put key and create arraylist in map
		    }
		    map.get(str2).add(str1);               //get key & put value after point
		}
		List<List<String>> ans = new ArrayList();   // [["dsgg","qfbs","fbaa"],["vaagd","bds","baeg"]] list inside lists
		for(List<String> lst: map.values())          // ["dfaaf","brga"]  one by one list coming
		    ans.add(lst);                            // ["fadgb","bfa"]  add one by one list in list
		return ans;
	}
}