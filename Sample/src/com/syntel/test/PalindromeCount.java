package com.syntel.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PalindromeCount {

	public static void main(String[] args) {

		String s = "Hello MADAM MADAM Hello BOB";

		String[] s1 = s.split(" ");
		Map<String, Integer> mp = new HashMap<>();

		
		for (int j = 0; j < s1.length; j++) {
			String s2 = "";
			s2 = s2 + s1[j];
			int i = 0;
			String s3 = "";

			while (i < s2.length()) {

				s3 = s3 + java.lang.Character.toString(s2.charAt(i));
				i++;

			}

			int n = s2.length();

			String s4 = "";
			while (n > 0) {

				s4 = s4 + java.lang.Character.toString(s2.charAt(n - 1));

				n--;

			}
			int c = 0;

			if (s3.contentEquals(s4)) {

				c++;

				if (mp.containsKey(s3)) {
					mp.put(s3, mp.get(s3)+1);
				} else {

					mp.put(s3, c);

				}

			}

		}

		Iterator it = mp.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
