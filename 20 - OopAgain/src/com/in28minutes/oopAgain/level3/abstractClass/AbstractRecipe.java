package com.in28minutes.oopAgain.level3.abstractClass;

public abstract class AbstractRecipe {
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();
	// prepare
	// recipe
	// cleanup
}
