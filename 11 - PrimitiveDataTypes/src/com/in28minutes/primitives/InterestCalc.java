package com.in28minutes.primitives;

import java.math.BigDecimal;

public class InterestCalc {
	private BigDecimal principal;
	private BigDecimal interestRate;

	InterestCalc(String principal, String interestRate) {
		this.principal = new BigDecimal(principal);
		this.interestRate = new BigDecimal(interestRate);
	}

	BigDecimal calculateTotalValue(int years) {
		BigDecimal interest = this.principal.multiply(interestRate).multiply(new BigDecimal(years));

		return this.principal.add(interest);
	}

}
