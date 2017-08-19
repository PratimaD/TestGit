package com.exa;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	public static void main(String[] args) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		// add elements to a set
		set.add("India");
		set.add("Delhi");
		set.add("Noida");
		set.add("Usa");
		// Removing an element from a Set
		set.remove("Noida");
		System.out.println(set);
		System.out.println();
		// Check if a Set is empty
		if (set.isEmpty()) {
			System.out.println("The set is empty");
		} else {
			System.out.println("The set is not empty");
		}
		System.out.println();

		// Get total number of elements in a Set
		System.out.printf("The set has %d elements", set.size());
		System.out.println();

		// Traversing elements
		// It is an universal cursor to retrieve objects one by one from the
		// collection
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		// Remove all elements from a Set
		set.clear();
		System.out.println(set);
		System.out.println();

	}
}
