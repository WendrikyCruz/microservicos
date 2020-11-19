package com.microservicepayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.microservicepayroll.entities.Payment;
import com.microservicepayroll.entities.Worker;
import com.microservicepayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerfeignclient;
	
	public Payment getPayment(long workerId, int days) {
	
		Worker worker = workerfeignclient.findById(workerId).getBody();
				
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
