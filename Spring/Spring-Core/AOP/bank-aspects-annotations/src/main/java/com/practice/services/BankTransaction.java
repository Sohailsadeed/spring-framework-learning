package com.practice.services;

import org.springframework.stereotype.Service;

@Service
public class BankTransaction {
	public void initiateUpiTrans() {
		System.out.println("Busininess Logic for UPI Transactions");
	}
	
	public void initiateWalletTrans() {
		System.out.println("Business Logic for Wallet Transaction");
	}
	
}
