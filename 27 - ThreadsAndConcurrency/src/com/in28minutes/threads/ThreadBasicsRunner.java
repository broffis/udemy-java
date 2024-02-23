package com.in28minutes.threads;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.print("\nTask 1 Started\n");
		for (int i = 101; i < 199; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask 1 Done\n");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask 2 Started\n");
		for (int i = 201; i < 299; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask 2 Done\n");
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
//		threadDemo();

//		priorityDemo();

//		joinDemo();

//		threadUtilityMethods();

		threadControl();

	}

	static void threadDemo() {
		// Task 1
		Task1 task1 = new Task1();
		task1.start();

		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();

		System.out.print("\nTask 3 Started\n");
		for (int i = 301; i < 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask 3 Done\n");

		System.out.print("\n Main Method Done");

		/* Life cycle of a thread */
		// - NEW
		// - RUNNABLE
		// - RUNNING
		// - BLOCKED/WAITING
		// - TERMINATED/DEAD
	}

	static void priorityDemo() {
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		System.out.print("\nTask 3 Started\n");
		for (int i = 301; i < 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask 3 Done\n");

		System.out.print("\n Main Method Done");
	}

	static void joinDemo() throws InterruptedException {
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// wait for task1

		task1.join();
		task2Thread.join();

		System.out.print("\nTask 3 Started\n");
		for (int i = 301; i < 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask 3 Done\n");

		System.out.print("\n Main Method Done");
	}

	static void threadUtilityMethods() throws InterruptedException {
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);

		Thread.sleep(100); // wait to execute for n milliseconds

		Thread.yield(); // Wait patiently for cpu
	}

	static void threadControl() throws InterruptedException {
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// wait for task1

		task1.join();
		task2Thread.join();

		System.out.print("\nTask 3 Started\n");
		for (int i = 301; i < 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask 3 Done\n");

		System.out.print("\n Main Method Done");
	}

}
