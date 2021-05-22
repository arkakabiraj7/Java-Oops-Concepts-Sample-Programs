package com.syntel.test;

public class RemoveString {

	public static void main(String[] args) {

		String s = "A computer Science Portal";
		String removeStr = "For";
		String[] s1 = s.split(" ");
		String mpdifiedStr = "";
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].contentEquals(removeStr)) {
				s1[i] = s1[i].replace(removeStr, "");

			}

			mpdifiedStr = mpdifiedStr + s1[i] + " ";

		}

		System.out.println(mpdifiedStr);

	}

}
