package com.in28minutes.oopAgain.level3.abstractClass;

public class RecipeWithMicrowave extends AbstractRecipe {
	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Prepare the dish");
		System.out.println("Put it in the microwave");
	}

	@Override
	void cleanup() {
		System.out.println("Switch off the mictrowave");
		System.out.println("Clean the kitchen");
	}
}
