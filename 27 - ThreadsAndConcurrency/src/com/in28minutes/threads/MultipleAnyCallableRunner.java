package com.in28minutes.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		ExecutorService executorService = Executors.newFixedThreadPool(1);
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("Ranga"), new CallableTask("in28minutes"),
				new CallableTask("Adam"));

		String result = executorService.invokeAny(tasks);

		System.out.println(result);

		executorService.shutdown();

	}

}
