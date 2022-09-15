package test;

import java.util.HashMap;
import java.util.Map;

public class Test {
//test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbb";
		printMaxOcc( s);

	}
	
	public static void printMaxOcc(String str)
	{
		char c=' ';
		int max=0;
		Map<Character, Integer>  map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			
			if(map.containsKey(str.charAt(i)))
			{
				int count =map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
			
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> list:map.entrySet())
		{
			
			if(max<list.getValue())
			{
				c=list.getKey();
				max=list.getValue();
			}
		}
		System.out.println(c +":"+max);
		
	}

}
