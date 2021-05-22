package com.syntel.test;

public class SwappingCornersOfInteger {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3,4, 5 ,6 };
		int b[] = { 4, 5, 6,7,8,9 };
		int Atemp = 0;
		int Btemp = 0;
		int i = 0;
		for (i = 0; i < a.length; i++) {
			if (i == 0) {
				Atemp = a[i];
				Btemp = b[i];
				a[i] = b[a.length - 1];
				b[i] = a[a.length - 1];
			}

			if (i == a.length - 1) {
				a[a.length - 1] = Btemp;
				b[b.length - 1] = Atemp;

			}
		}

		int c[] = new int[a.length];

		int j = 0;
		for (j = 0; j < c.length; j++) {
			c[j] = a[j] + b[j];

			System.out.print(c[j] + ",");

		}

	}

}
