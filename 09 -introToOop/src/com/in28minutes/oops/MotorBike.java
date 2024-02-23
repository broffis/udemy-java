package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;
	private String name;

	MotorBike() {
		this(0, "");
	}


	MotorBike(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}

	// behavior
	void start() {
		System.out.println(this.name + " started");
	}

	private void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	void accelerate(int speed) {
		if (speed > 0) {
			this.setSpeed(this.speed + speed);
		}
	}

	void decelerate(int speed) {
		if (speed > 0) {
			this.setSpeed(this.speed - speed);
		}
	}

	int checkSpeed() {
		return this.speed;
	}
}
