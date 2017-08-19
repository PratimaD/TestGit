package com.exa;

import java.util.LinkedList;

/**
 * By using enumeration and iterator you can get only read access ,remove and we can move only forward direction and we can't perform bidirectional process.
 * To overcome this limitation we should go for listIterator.
 * 
 * While iterating object by ListIterator we can move both farword and backward direction.
 * and also we can perform read,set,replace,add,nextIndex,hasNext(),next(),hasPrevious(),previous.
 * @author HI
 *
 */
public class ListIteratorExample {
public static void main(String[] args) {
	//instance creation
	LinkedList list=new LinkedList();
	// add elements to a list
	list.add("Mock");
	list.add("Jock");
	list.add("Mocky");
	list.add("Jandiya");
	list.add("Mehan");
	list.add("Yijung");
	System.out.println(list);
	
}
}
