package com.in28minutes.oopAgain;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.34567, "green");

		System.out.println(fan);

		fan.switchOn();
		fan.setSpeed((byte) 5);

		System.out.println(fan);

		fan.setSpeed((byte) 3);
		System.out.println(fan);

		fan.switchOff();
		System.out.println(fan);

	}

}
