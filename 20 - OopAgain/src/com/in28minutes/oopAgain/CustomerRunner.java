package com.in28minutes.oopAgain;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line 1", "Charlotte", "28215");
		Customer customer = new Customer("Brandon", homeAddress);

		Address workAddress = new Address("line 1 for work", "Charlotte", "28215");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);

	}

}
