package com.syntel.test;

public class StringOnlyAlphabets {

	public static void main(String[] args) {

		String s = "GeeksforGeeks";

		String numberStr = "1,2,3,4,5,6,7,8,9,0";

		String arrayStr[] = numberStr.split(",");

		int c = 0;

		for (int i = 0; i < s.length(); i++) {
			int j = 0;
			while (j < arrayStr.length) {

				if (java.lang.Character.toString(s.charAt(i)).contains(arrayStr[j])) {
					c++;
				}
				j++;

			}

		}

		if (c > 0) {
			System.out.println("Not only alphabet String");
		}

		else

		{
			System.out.println("only alphabet String");
		}
	}

}
