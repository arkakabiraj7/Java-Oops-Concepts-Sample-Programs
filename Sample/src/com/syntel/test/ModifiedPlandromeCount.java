package com.syntel.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ModifiedPlandromeCount {

	public static void main(String[] args) {
	String s=	"Hello MADAM MADAM Hello BOB RAR RAR RAR RAR";
	
	
	String s1[] = s.split(" ");
	
	Map<String,Integer> mp = new TreeMap<>();
	
	for(int i=0;i<s1.length;i++)
	{
		int c=0;
		StringBuilder sb = new StringBuilder(s1[i]);
		if(s1[i].contentEquals(sb.reverse()))
		{
			c++;
			
			
			if(mp.containsKey(s1[i]))
			{
				mp.put(s1[i],mp.get(s1[i])+1);
				
			}
			
			else
			{
			
			
			   mp.put(s1[i],c);
			}
			
			
			
			
		}
				

	}
	
	
	
Iterator it =	mp.values().iterator();
List<Integer> lt = new LinkedList<>();

while(it.hasNext())
{
	lt.add((Integer)it.next());
}






	System.out.println("Largest Palindrom String :: " +lt.get(lt.size()-1));
	System.out.println("Smallest Palindrome String::  " +lt.get(0) );


	
	
	//Iterator it =mp.entrySet().iterator();
	//while(it.hasNext())
	//{
	//	System.out.println(it.next());
	//}
	
	
	
	}

}
