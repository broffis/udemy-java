package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100, "ducati");
		MotorBike honda = new MotorBike(200, "honda");
		MotorBike other = new MotorBike();

		ducati.start();
		honda.start();
		other.start();

		ducati.accelerate(100);
		honda.accelerate(80);

		System.out.println(ducati.checkSpeed());

		ducati.accelerate(20);
		System.out.println(ducati.checkSpeed());

		ducati.decelerate(80);
		System.out.println(ducati.checkSpeed());
	}

}
