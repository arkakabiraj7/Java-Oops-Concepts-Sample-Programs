package com.syntel.test;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		String s = "Hello MADAM MADAM Hello BOB RAR RAR RAR RAR";
		
		
		String s1[] = s.split(" ");
		List<String> lst = new LinkedList<>();
		int c=0;
		
		for (int i = 0; i < s1.length; i++) {
			
			
				lst.add(s1[i]);
			
							
		}
		
		Iterator<String> it =lst.iterator();
		Map<String,Integer> mp = new LinkedHashMap<>();
		
		int i=0;	
		while(it.hasNext())
		{
			
		  if(mp.isEmpty())
		  {
			
	       mp.put(it.next(),1);
	       
		  }
		  
		  else if(mp.containsKey(it.next()))
		 {
			  String key=it.next();
			  int value=mp.get(key);
			  
			  
			  mp.put(key, value+1);
		 }
	      
		
		
		else
			
		{
			mp.put(it.next(),1);
		}
		  
		  i=i+1;
		
	}
		
		
		Iterator it1 =mp.entrySet().iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		
		
		

		

	}

}
