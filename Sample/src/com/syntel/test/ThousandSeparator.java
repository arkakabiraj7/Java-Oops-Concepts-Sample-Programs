package com.syntel.test;

public class ThousandSeparator {

	public static void main(String[] args) {
		int n =123456789;
		char ch ='.';
		
		
		String n1 = Integer.toString(n);
		
		StringBuffer b= new StringBuffer(n1);
		
		  b=b.reverse();
		  
		  n1=b.toString();
		  int i=0;
		  String emptyString="";
		  
		  for(char c1 : n1.toCharArray())
		  {
			  
			  emptyString=emptyString+c1;
			  
			  i++;
			  
			  if(i%3==0)
			  {
				  
				  emptyString=emptyString+java.lang.Character.toString(ch);
			  }
		  }
		  
		  
		  
		  emptyString=  emptyString.substring(0, emptyString.length()-1);
		 
		  StringBuffer b1= new StringBuffer(emptyString);
		  
		  System.out.println(b1.reverse());
		
		
				
		
		

	}

}
