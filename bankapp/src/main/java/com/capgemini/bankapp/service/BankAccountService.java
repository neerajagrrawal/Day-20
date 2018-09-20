package com.capgemini.bankapp.service;

import com.capgemini.bankapp.exception.LowAccountBalanceException;

public interface BankAccountService {
	
	public double getBalance(long accountId);
	public double withdraw(long accountId, double amount) throws LowAccountBalanceException;
	public double deposit(long accountId, double amount);
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws LowAccountBalanceException;
}