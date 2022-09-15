package test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str="pushpa";
	
	Map <Character, Integer> map=new TreeMap<>();
	
	for(int i=0;i<=str.length()-1;i++)
	{
		if(map.containsKey(str.charAt(i)))
		{
			int count =map.get(str.charAt(i));
			map.put(str.charAt(i),++count);
		}
		else 
		{
			map.put(str.charAt(i), 1);
		}
		
	}
	System.out.println(map);

	}

}
