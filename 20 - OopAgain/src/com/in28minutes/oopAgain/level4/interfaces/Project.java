package com.in28minutes.oopAgain.level4.interfaces;

public class Project {

	public static void main(String[] args) {
//		ComplexAlgorithm alg = new DummyAlgorithm();
		ComplexAlgorithm alg = new RealAlgorithm();
		System.out.println(alg.complexAlgorithm(10, 20));

	}

}
