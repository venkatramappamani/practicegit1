package com.gen.test;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1="MynameIsNarayana";
      String str= str1.toLowerCase();
      HashMap<Character, Integer> map=new HashMap<>();
      for(int i=0;i<=str.length()-1;i++)
      {
    	  if(map.containsKey(str.charAt(i)))
    	  {
    		 int count= map.get(str.charAt(i));
    		  map.put(str.charAt(i), ++count);
    	  }
    	  else
    	  {
    		  map.put(str.charAt(i), 1);
    	  }
    	  
      }
      System.out.println(map);
      
	}

}
