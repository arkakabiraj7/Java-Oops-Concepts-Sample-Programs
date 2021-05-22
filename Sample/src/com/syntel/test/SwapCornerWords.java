package com.syntel.test;

public class SwapCornerWords {

	public static void main(String[] args) {

		String s = "Hello World GFG Welcomes You";
		String revStr = "";
		String StartStr = "";
		String EndStr = "";
		String s1[] = s.split(" ");
		String temp = "";

		for (int i = 0; i < s1.length; i++) {
			if (i == 0) {
				temp = s1[i];
				s1[i] = s1[s1.length - 1];
				StartStr = StartStr + s1[i] + " ";

			}

			else if (i == s1.length - 1) {
				s1[s1.length - 1] = temp;
				EndStr = " " + EndStr + s1[s1.length - 1];
					
			}

			else {
				revStr = revStr + s1[i] + " ";
			}

		}

		StringBuffer bf = new StringBuffer(revStr);
		String s3 = bf.reverse().toString();
		System.out.print(StartStr.concat(s3).concat(EndStr));

	}

}
