package com.in28minutes.primitives;

import java.math.BigDecimal;

public class InterestCalcRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestCalc calculator = new InterestCalc("4500.00", "7.5");

		BigDecimal totalValue = calculator.calculateTotalValue(5);

		System.out.println(totalValue);
	}

}
