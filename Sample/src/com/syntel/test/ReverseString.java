package com.syntel.test;

public class ReverseString {

	public static void main(String[] args) {
		
		String s= "arka kabiraj";
		int len=s.length();
		String s1="";
		while(len>0)
		{
			
			s1=s1+s.charAt(len-1);
			len--;
			
		}
		
		
		System.out.println(s1);
		
		

	}

}
