package com.syntel.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeMap;


public class HashcodeImplementation implements Comparable<Demo>    {

	public static void main(String[] args) {

      Demo d = new Demo(2);
      Demo d1 = new Demo(4);
      Demo d2 = new Demo(6);
      
      
      String[] str= new String[]{"a,b,l"};
      
      
     java.util.List<String> lst = Arrays.asList(str);
     java.util.List<ArrayList> lst1= new ArrayList(lst);
     
     
     PriorityQueue pq = new PriorityQueue();
     
     
     
     //lst.toArray();
     //System.out.println(lst);
      
      
    /*  ListIterator lt =lst.listIterator();
      
      while(lt.hasNext())
      {
    	 // System.out.println(lt.previous());
    	  System.out.println(lt.next());
    	  
      }*/
     
    // Comparator<String> c =Collections.reverseOrder();
     //Collections.sort(lst, c);
     Iterator<String> it = lst.iterator();
     
    //Collections.re
     
     
    // System.out.println(lst);
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
     
     
		/*
		 * for(String str1: lst) { System.out.println(str1); }
		 */
     
     
      
      
     // System.out.println(Arrays.tos
      
      
      
      TreeMap<String,Demo> mp= new TreeMap<String,Demo>();
       
      mp.put("a",d);
      mp.put("b",d1);
      mp.put("c",d2);
      
      
      
        // System.out.println(mp.entrySet().iterator().next().getValue());
      
      System.out.println(mp.size());
    //  Iterator it =mp.entrySet().iterator();
      
     // while(it.hasNext())
     // {
    //	  System.out.println(it.next());
    	  
    //  }
      
      
    //  ListIterator lt =mp.entrySet().iterator();
      
      
      
      
      
      
      mp.remove("b");
      System.out.println(mp.entrySet());
      
      
	}

	@Override
	public int compareTo(Demo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	

}


class Demo
{
	private int i;
	
	public Demo(int i)
	{
		this.i=i;
		
	}
	
	
	@Override
	public boolean equals(Object o)
	{
		if(o!=null&& o instanceof  Demo)
		{
			return true;
		}
		
		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		
		return this.i;
	}
	
	
	
}
