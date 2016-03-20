package com.julio.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("dd");
		list.add("bb");
		list.add("cc");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("ff");
		list2.add("gg");
		
		Collections.sort(list);
		System.out.println(list.toString());
		
		Collections.swap(list, 0, 3);
		System.out.println(list.toString());
		
		Collections.reverse(list);
		System.out.println(list.toString());
		
		Collections.shuffle(list);
		System.out.println(list.toString());
		
		Collections.sort(list);
		int pos = Collections.binarySearch(list, "cc");
		System.out.println(pos);
		
		System.out.println(Collections.disjoint(list, list2));
		
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
	}
}
