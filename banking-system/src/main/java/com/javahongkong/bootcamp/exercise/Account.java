package com.javahongkong.bootcamp.exercise;

public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin,
			double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		// return null;
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
		return true;
	}

	public double getBalance() {
		// complete the function
		// return -1.0;
		return this.balance;
	}

	public double getPin() {
		// complete the function
		// return -1.0;
		return this.pin;
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal
	}

	public boolean debitAccount(double amount) {
		// complete the function
		return true;
	}
}
