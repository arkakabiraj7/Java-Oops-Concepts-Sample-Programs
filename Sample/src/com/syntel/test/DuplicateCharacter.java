package com.syntel.test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String [] str = new String[] {"arka kabiraj"};
		String [] str1 = new String["arka kabiraj".length()];
		
		Map<Integer,String> mp = null;
		
		int i=0;
		int c=0;
		
		int len="arka kabiraj".length();
		while(i<len)
		{	
			str1[i]=java.lang.Character.toString("arka kabiraj".charAt(i));
			
			if(mp==null)
			{
			
				mp=new HashMap<>();
			}
			
			if(mp.containsValue(str1[i]))
			{
				c++;
			}
			
		   mp.put(i, str1[i]);
			
			
			
			i++;
		}
		
		System.out.println(c);
		

	}

}
