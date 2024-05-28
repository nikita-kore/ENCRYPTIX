package com.encryptix.atminterface;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		AtmOperationInterface op = new AtmOperationImpl();

		int atmnumber = 12345;
		int atmpin = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n*******************WELCOME To ATM MACHINE !!!!********************\n");
		System.out.println("ENTER ATM NUMBER : \n");
		int atmNumber = sc.nextInt();
		System.out.println("ENTER PIN:\n");
		int pin = sc.nextInt();

		if ((atmnumber == atmNumber) && (atmpin == pin)) {

			while (true) {
				System.out.println("*************************************************************");
				System.out.println("1.View Available Balance\n" + "2.Withdraw Amount\n" + "3.Deposite Amount\n"
						+ "4.View Ministatement\n" + "5.Exit\n");
				System.out.println("*************************************************************");

				System.out.println("Enter  Choice : ");
				System.out.println("***************************************************************");
				int ch = sc.nextInt();
				if (ch == 1) {
					op.viewBalance();

				} else if (ch == 2) {

					System.out.println("Enter  amount to  withdraw");
					double withdrawAmount = sc.nextDouble();
					op.withdrawAmount(withdrawAmount);

				} else if (ch == 3) {

					System.out.println("Enter Amount to Deposit :");
					double depositAmount = sc.nextDouble();// 50000
					op.depositAmount(depositAmount);

				} else if (ch == 4) {
					op.viewMiniStatement();

				} else if (ch == 5) {
					System.out.println("Collect Your ATM Card\n Thank you for using Atm Machine");

				} else {
					System.err.println("Please Enter  Correct Choice");

				}
			}

		} else {
			System.err.println("Incorrect Atm Number or pin");
		}

	}

}
