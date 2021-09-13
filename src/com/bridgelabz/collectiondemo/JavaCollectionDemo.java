package com.bridgelabz.collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaCollectionDemo {

	public static void main(String[] args) {

		doListDemo();

	}

	private static void doListDemo() {

		System.out.println("In doListDemo");
		List<String> list = new LinkedList<>();

		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
