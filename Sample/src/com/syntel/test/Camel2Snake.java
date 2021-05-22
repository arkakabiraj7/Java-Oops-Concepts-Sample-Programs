package com.syntel.test;

public class Camel2Snake {

	public static void main(String[] args) {
		
		String s="CamelCaseToSnakeCase";
		String resultedStr="";
		int i=0;
		char[] ch= s.toCharArray();
		char[] ch1= new char[s.length()+7];
		
		for(char c: ch)
		{
			
			 if((int)c>=65 && (int)c<97)
			 {
				 if(i!=0)
				 {
					
				 
				 ch1[i]=java.lang.Character.toLowerCase(c);
				 ch1[i-1]='_';	
				 resultedStr=resultedStr+ch1[i]+ch1[i-1];
				 }
				 
				 else
				 {
				 
				 resultedStr=resultedStr+ch[i];
				 
				 }
				
				 
				 
			 }
			 
			 
			 else
			 {
			 
			 resultedStr=resultedStr+ch[i];
			 
			 }
			 
			 i++;
			
		}
		
		System.out.println(resultedStr);

	}

}
