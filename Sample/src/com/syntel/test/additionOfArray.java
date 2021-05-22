package com.syntel.test;

public class additionOfArray {

	public static void main(String[] args) {
		
		
		int [] a=  {1,2,3};
		int [] b = {4,5,6};
		
		
		int [] c = new int[a.length];
		int i;
		
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.print(c[i]+",");
		}
		
		

	}

}
