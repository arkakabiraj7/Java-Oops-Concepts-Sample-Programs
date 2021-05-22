package com.syntel.test;
import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		
		String s= "arka kabiraj";
		
		
		Stack<String> lt = new Stack<>();
		for(char c : s.toCharArray())
		{
			lt.push(java.lang.Character.toString(c));
			
		}
		
		
		while(lt.size()>0)
		{
		  System.out.print(lt.pop());
		
		}
		

	}

}
