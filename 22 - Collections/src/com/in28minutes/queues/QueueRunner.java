package com.in28minutes.queues;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String val1, String val2) {
		// TODO Auto-generated method stub
		return Integer.compare(val2.length(), val1.length());
	}
}

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));

		System.out.println(queue.poll()); // Cat
		System.out.println(queue.poll()); // Monkey
		System.out.println(queue.poll()); // Zebra

		Queue<String> queueWithComparator = new PriorityQueue<>(new StringLengthComparator());
		queueWithComparator.addAll(List.of("Zebra", "Monkey", "Cat"));

		System.out.println(queueWithComparator.poll()); // Monkey
		System.out.println(queueWithComparator.poll()); // Zebra
		System.out.println(queueWithComparator.poll()); // Cat
	}

}
