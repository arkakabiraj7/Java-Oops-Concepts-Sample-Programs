package com.syntel.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.qoppa.h.e;

public class FindDuplicateOccurrence {

	public static void main(String[] args) {
		
		
		int str[] = new int[] {1,2,3,1};
		int c=0;
		
		
		//List<String> lst= Arrays.asList(str);
		
		List<Integer> modifiedLst = new ArrayList<>();
		for(int i=0;i<str.length;i++)
		{
			if(modifiedLst.contains(str[i]))
			{
				c++;
		     }
			
			
			
			modifiedLst.add(str[i]);
			
			
		}
		
		//java.util.Set<Integer> st= new java.util.LinkedHashSet<>(modifiedLst);
		
		System.out.println(c);
				
		
	
	}

}
