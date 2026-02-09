package com.practice.services;

import org.springframework.stereotype.Service;

@Service
public class AtmServices {
	public void initiatePinTransaction() {
		System.out.println("Initiataing PIN transaction through ATM");
	}
	
	public void initiateCardLessTransaction() {
		System.out.println("Initiating CardLesstransaction through ATM");
	}
}
