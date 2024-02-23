package com.in28minutes.queues;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		introToQueues();

	}

	static void introToQueues() {
		Queue<String> queue = new PriorityQueue<>();

		System.out.println(queue.poll()); // null

		queue.offer("Apple");
//		System.out.println(queue.poll()); // Apple

		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue); // alphabetical queue

		queue.poll(); // Apple
		queue.poll(); // Cat
		queue.poll(); // Monkey
		queue.poll(); // Zebra
		queue.poll(); // null

	}

}
