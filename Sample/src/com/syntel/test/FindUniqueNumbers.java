package com.syntel.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindUniqueNumbers {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 6, 8, 10, 17, 34 };
		int b[] = { 2, 8, 17, 33, 44, 66, 89, 100, 123 };
		List<Integer> bList = new ArrayList<>();
		List<Integer> aList = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			aList.add(a[i]);
		}

		for (int j = 0; j < b.length; j++) {

			bList.add(b[j]);
		}

		for (int s = 0; s < bList.size(); s++) {
			int iterate = 0;

			while (iterate < aList.size()) {

				if (bList.get(s) == aList.get(iterate)) {
					bList.remove(s);
					aList.remove(iterate);
				}
				iterate++;

			}
		}

		Iterator<Integer> ait = aList.iterator();
		Iterator<Integer> bIt = bList.iterator();

		System.out.print("AList --------------------->");
		while (ait.hasNext()) {
			System.out.print(ait.next() + ",");
		}

		System.out.println();
		System.out.print("BList --------------------->");

		while (bIt.hasNext()) {
			System.out.print(bIt.next() + ",");
		}

	}

}
