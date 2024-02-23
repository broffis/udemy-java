package com.in28minutes.funtionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer num) {
		// TODO Auto-generated method stub
		return num % 2 == 0;
	}
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer num) {
		// TODO Auto-generated method stub
		System.out.println("consumer: " + num);

	}
}

class NumberSquareMaper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer num) {
		// TODO Auto-generated method stub
		return num * num;
	}
}

public class LambdaRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 43, 34, 45, 48, 36);
		List.of(23, 43, 34, 45, 48, 36).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println("base: " + e));

		// FILTER
		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t);

		List.of(23, 43, 34, 45, 48, 36).stream().filter(new EvenNumberPredicate())
				.forEach(e -> System.out.println("predicate: " + e));

		// FOREACH
		// void forEach(Consumer<? super T> action);
		// void accept(T t);

		List.of(23, 43, 34, 45, 48, 36).stream().filter(new EvenNumberPredicate()).forEach(new SystemOutConsumer());


		// MAP
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		//  R apply(T t);
		List.of(23, 43, 34, 45, 48, 36).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMaper())
				.forEach(e -> System.out.println("map: " + e));
	}

}
