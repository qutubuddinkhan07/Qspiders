package com.qsp.comparable_comparator;

import java.util.Comparator;
import java.util.TreeMap;

public class AscendingComparator {
	public static void main(String[] args) {
		TreeMap t = new TreeMap(new MyComparator());
		t.put(555, "aaa");
		t.put(333, "ccc");
		t.put(222, "abc");
		t.put(444, "eee");
		t.put(111, "fff");
		System.out.println(t); // {555=aaa, 444=eee, 333=ccc, 222=abc, 111=fff}

	}
}

class MyComparator implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		return I2.compareTo(I1);
	}
}
