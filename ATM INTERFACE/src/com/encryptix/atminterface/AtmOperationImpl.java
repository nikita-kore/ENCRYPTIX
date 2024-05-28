package com.encryptix.atminterface;
import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface {

	ATM atm = new ATM();
	Map<Double, String> ministmt = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Avilable Balance is:" + atm.getBalance());

	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if (withdrawAmount <= atm.getBalance()) {
			ministmt.put(withdrawAmount, " Amount withdraw");
			System.out.println("Collect the cash " + withdrawAmount);
			atm.setBalance(atm.getBalance() - withdrawAmount);
			viewBalance();

		} else {
			System.err.println(" Insufficient Balance !!!");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount, "AmountDeposited");
		System.out.println(depositAmount + " Deposite Successfully !!!");
		atm.setBalance(atm.getBalance() + depositAmount);
		viewBalance();

	}

	@Override
	public void viewMiniStatement() {
		for (Map.Entry<Double, String> m : ministmt.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
