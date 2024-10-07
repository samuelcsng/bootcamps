package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Account implements AccountInterface {
	public static Long accountNumberStart = 0L;

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

	@Override
	public AccountHolder getAccountHolder() {
		// complete the function
		// return null;
		return this.accountHolder;
	}

	@Override
	public boolean validatePin(int attemptedPin) {
		// complete the function
		// return true;
		return this.pin == attemptedPin;
	}

	@Override
	public double getBalance() {
		// complete the function
		// return -1.0;
		return this.balance;
	}

	@Override
	public double getPin() {
		// complete the function
		// return -1.0;
		return this.pin;
	}

	@Override
	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	@Override
	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal

		this.balance += amount;

		// this.balance = BigDecimal.valueOf(this.balance) //
		// .add(BigDecimal.valueOf(amount)) //
		// // .setScale(2, RoundingMode.HALF_UP) //
		// .doubleValue() //
		// ;

		// double balanceDouble = BigDecimal.valueOf(this.balance) //
		// 		.add(BigDecimal.valueOf(amount)).doubleValue();
		// this.balance = Math.round(balanceDouble * 100) / 100;

	}

	@Override
	public boolean debitAccount(double amount) {
		// complete the function
		// return true;

		// this.balance -= amount;

		double balanceAfterDebit = BigDecimal.valueOf(this.balance) //
		.subtract(BigDecimal.valueOf(amount)) //
		// .setScale(2, RoundingMode.HALF_UP) //
		.doubleValue() //
		;
		if (balanceAfterDebit < 0) {
			return false;
		} else {
			this.balance = balanceAfterDebit;
			return true;
		}

		// double balanceAfterDebitDouble = BigDecimal.valueOf(this.balance) //
		// 		.subtract(BigDecimal.valueOf(amount)).doubleValue();
		// // this.balance = Math.round(balanceDouble * 100) / 100;
		// if (balanceAfterDebitDouble < 0) {
		// 	return false;
		// } else {
		// 	this.balance = Math.round(balanceAfterDebitDouble * 100) / 100;
		// 	return true;
		// }

	}
}
