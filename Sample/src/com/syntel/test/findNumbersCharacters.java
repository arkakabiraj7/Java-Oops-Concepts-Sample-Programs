package com.syntel.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class findNumbersCharacters {

	public static void main(String[] args) {
		
		
		String s="my name is arka. i hae scored 100 centuries in the year 1 january 1992";
		s="my name is arka.:i hae scored 100 centuries in the year 1 january 1992";
		
		String [] s1 = s.split(":");
		
		int [] number = {1,2,3,4,5,6,7,8,9,0};
	    Map<String,Integer> mp = new HashMap<>();
		
		int numberCount=0;
		int LetterCount=0;
		
		for(int i=0;i<s1.length;i++)
		{
		    for(int j=0;j<number.length;j++)
		    {
		    	for(char c : s1[i].toCharArray())
		    	{
		    	
		    	if(java.lang.Character.toString(c).contains(Integer.toString(number[j])))
		    	{
		    		numberCount++;
		    		if(mp.containsKey("NumberCount"))
		    		{
		    			mp.put("NumberCount", mp.get("NumberCount")+1);
		    		}
		    		
		    		
		    		else
		    		{
		    		
		    		   mp.put("NumberCount",numberCount );
		    		}
		    	}
		    	
		    	else
		    	{
		    			
		    		
		    		LetterCount++;
		    		
		    		if(mp.containsKey("LetterCount"))
		    		{
		    			mp.put("LetterCount", mp.get("LetterCount")+1);
		    		}
		    		
		    		
		    		else
		    		{
		    		
		    			mp.put("LetterCount",LetterCount );
			    	}
		    		}
		    		
		    		
		    	}
		    }
		}
		
		
		
		Iterator it = mp.entrySet().iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		

	}

}
