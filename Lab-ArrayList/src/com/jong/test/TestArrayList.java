package com.jong.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.jong.model.Item;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Item>items = new ArrayList<Item>();
		
		items.add(new Item(1, "This is item1"));
		items.add(new Item(2, "This is item2"));
		items.add(new Item(3, "This is item3"));
		items.add(new Item(4, "This is item4"));
		items.add(new Item(5, "This is item5"));
		//print third item
		System.out.println(items.get(2));
		//remove last item
		Item removed = items.remove(items.size()-1);
		System.out.println(removed);
		
		//iterator
		Iterator<Item> it = items.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			System.out.println("removing item: " + item);
			it.remove();
			//it.remove();
			//items.add(new Item(6, "This is a new item"));
			
		}
		//confirm size is 0
		System.out.println(items.size());
	}

}
