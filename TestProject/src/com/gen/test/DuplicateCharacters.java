package com.gen.test;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str="jhfgdhj";
		for(int i=0;i<=Str.length()-1;i++) {
			int count=1;
			for(int j=i+1;j<=Str.length()-1;j++)
			{
				if(Str.charAt(i)==Str.charAt(j))
				{
					count=count+1;
				}
				
			}
			if(count >1)
			System.out.println(Str.charAt(i)+" iS :"+count);
		}
	}

}
