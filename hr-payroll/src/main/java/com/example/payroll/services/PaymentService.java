package com.example.payroll.services;

import org.springframework.stereotype.Service;

import com.example.payroll.entites.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.00, days);
	}
}
