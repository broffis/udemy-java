package com.in28minutes.oopAgain.level4.interfaces;

abstract class Animal {
	abstract void speak();
}

class Cat extends Animal {
	@Override
	void speak() {
		System.out.println("Meow meow");

	}

}

class Dog extends Animal {
	@Override
	void speak() {
		System.out.println("Woof woof");

	}

}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Cat(), new Dog() };
		for (Animal animal : animals) {
			animal.speak();
		}

	}

}
