package com.syntel.test;

public class SwappingCharacters {

	public static void main(String[] args) {
		
		String s="true";
		
		boolean b= Boolean.parseBoolean(s);
		System.out.println(b);
		System.out.println(s.charAt((s.length()-1)/2));
		
		
		
		
		char[] c= s.toCharArray(); 
		String resultedstr="";
		char temp='c';
		
		for(int i=0;i<c.length;i++)
		{
			if(i==1)
			{
				
				temp=c[i];
			c[i]=c[7];
		
			
			}
			
			else if(i==7)
			{
				
				c[i]=temp;
				
				
			}
			
			resultedstr=resultedstr+c[i];
		}
		
		
		for(char c1 : resultedstr.toCharArray())
		{
		
	
			System.out.print(c1);
		}
		
		

	}

}
