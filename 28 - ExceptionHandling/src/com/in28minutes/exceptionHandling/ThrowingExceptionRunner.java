package com.in28minutes.exceptionHandling;

class CurrenciesDoNotMatchException extends Exception {

	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws CurrenciesDoNotMatchException {
		if (!this.currency.equals(that.currency)) {
//			throw new RuntimeException("Currencies Don't Match");
//			throw new Exception("Currencies don't match CHECKED EXCEPTION" + this.currency + " " + that.currency);
			throw new CurrenciesDoNotMatchException(
					"Currencies don't match CHECKED EXCEPTION" + this.currency + " " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

}

public class ThrowingExceptionRunner {
	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("USD", 20);
		Amount amount3 = new Amount("EUR", 20);

		amount1.add(amount2);
		System.out.println(amount1);

		amount1.add(amount3);
		System.out.println(amount1);

	}

}
