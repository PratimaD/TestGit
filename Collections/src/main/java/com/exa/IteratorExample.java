package com.exa;

import java.util.HashSet;
import java.util.Iterator;
/**
 * By using enumeration you can get only read access and we can't perform any remove operations.
 * To overcome this limitation we should go for iterator.
 * 
 * @author HI
 *
 */
public class IteratorExample {
	public static void main(String[] args) {
		// here getting warning because not using any argument type
		//// Creating HashSet and adding elements
		HashSet s = new HashSet();
		// add elements to a set
		s.add("A");
		s.add("B");
		s.add("5");
		s.add("C");
		s.add("8");
		s.add("D");
		s.add("E");
		// It is an universal cursor to retrieve objects one by one from the
		// collection
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// removing elements from set
		s.remove("C");
		System.out.println(s);
	}
}
