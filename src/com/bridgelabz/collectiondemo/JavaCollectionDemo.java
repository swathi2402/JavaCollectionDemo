package com.bridgelabz.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class JavaCollectionDemo {

	public static void main(String[] args) {

		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo();
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

	private static void doStackDemo() {

		System.out.println("\nIn doStackDemo");
		Stack<String> stack = new Stack<>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");

		stack.pop();

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void doQueueDemo() {

		System.out.println("\nIn doQueueDemo");
		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");

		System.out.println("Head: " + queue.element());
		System.out.println("Head: " + queue.peek());
		System.out.println("Iterating the queue elements:");

		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		queue.remove();
		queue.poll();
		System.out.println("\nAfter removing two elements:");

		Iterator<String> iterator2 = queue.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

	private static void doSetDemo() {

		System.out.println("\nIn doSetDemo");
		Set<String> set = new LinkedHashSet<>();

		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");

		for (String str : set) {
			System.out.println(str);
		}
	}

	private static void doMapDemo() {

		System.out.println("\nIn doMapDemo: ");
		Map<Integer, String> map = new HashMap<>();

		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		for (Map.Entry<Integer, String> mapSet : map.entrySet()) {
			System.out.println(mapSet.getKey() + " " + mapSet.getValue());
		}
	}
}
