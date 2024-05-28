package com.encryptix.atminterface;

public class ATM {
	private double balance;
	private double depositAmount;
	private double withdrawAmount;

	// PARAMTERIZED CONSTRUCTER

	public ATM(double balance, double depositAmount, double withdrawAmount) {
		super();
		this.balance = balance;
		this.depositAmount = depositAmount;
		this.withdrawAmount = withdrawAmount;
	}

	// DEFAULT CONSTRUCTOR

	public ATM() {
		super();

	}

	// GETTER SETTER

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}                  

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	// TO STRING

	@Override
	public String toString() {
		return "ATM [balance=" + balance + ", depositAmount=" + depositAmount + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}

}
