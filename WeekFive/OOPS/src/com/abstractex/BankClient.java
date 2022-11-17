package com.abstractex;

abstract class Bank {
	abstract int getRateOfInterest();
}

class chase extends Bank {
	@Override
	int getRateOfInterest() {
		return 5;
	}
}

class BankOfAmerica extends Bank {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 10;
	}

}

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankOfAmerica bofa = new BankOfAmerica();
		System.out.println("Rate of Interest: " + bofa.getRateOfInterest());
	}

}
