package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;
import java.util.Random;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<>();
	}

	@Override
	public Account getAccount(Long accountNumber) {
		// complete the function
		// return null;
		return accounts.get(accountNumber);
	}

	@Override
	public Long openCommercialAccount(Company company, int pin,
			double startingDeposit) {
		// complete the function
		// return -1L;
		Long accountNumber = Account.accountNumberStart++;
		// Long accountNumber = new Random().nextLong();
		CommercialAccount newCommercialAccount =
				new CommercialAccount(company, accountNumber, pin, startingDeposit);
		this.accounts.put(accountNumber, newCommercialAccount);
		return accountNumber;
	}

	@Override
	public Long openConsumerAccount(Person person, int pin,
			double startingDeposit) {
		// complete the function
		// return -1L;
		Long accountNumber = Account.accountNumberStart++;
		// Long accountNumber = new Random().nextLong();
		ConsumerAccount newConsumerAccount =
				new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		this.accounts.put(accountNumber, newConsumerAccount);
		return accountNumber;
	}

	@Override
	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		// return true;
		return this.getAccount(accountNumber).getPin() == pin;
	}

	@Override
	public double getBalance(Long accountNumber) {
		// complete the function
		// return -1.0;
		return this.getAccount(accountNumber).getBalance();
	}

	@Override
	public void credit(Long accountNumber, double amount) {
		// complete the function
		this.getAccount(accountNumber).creditAccount(amount);
	}

	@Override
	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		// return false;
		return this.getAccount(accountNumber).debitAccount(amount);
	}
}
