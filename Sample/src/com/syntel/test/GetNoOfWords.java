package com.syntel.test;

public class GetNoOfWords {

	public static void main(String[] args) {
		
		String s ="arka is a very  bad boy";
		
		String[] s1 =s.split(" ");
		for(int i=0;i<=s1.length;i++)
		{
			if ((i==2) ||(i==s1.length-1))
			{
				System.out.println(s1[i]);
			}
		}
		

	}

}
