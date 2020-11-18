package com.microservicepayroll.services;

import org.springframework.stereotype.Service;

import com.microservicepayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 220.00, days);
	}
}
