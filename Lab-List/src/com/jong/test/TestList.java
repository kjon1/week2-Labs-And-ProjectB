package com.jong.test;

import com.jong.datastructures.List;

public class TestList {
	public static void main(String[] args) {
		List list = new List();
		list.set(0, "Bubblegum");
		System.out.println(list.get(0));
		
		int index = list.add("Bubblelicious");
		System.out.println(index);
		System.out.println(list.get(index));
		
		list.add("Boba");
		list.add("Cookie");
		list.add("Strawberry");
		list.add("Donut");
		list.add("Honeydew");
		
		String value = list.remove();
		System.out.println(value);
		
		value = list.remove();
		System.out.println(value);
	}

}
