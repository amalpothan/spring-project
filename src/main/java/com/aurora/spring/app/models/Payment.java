package com.aurora.spring.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long paymentId;

    @OneToOne
    @JoinColumn(name = "customer_order_id", nullable = false, unique = true) // One-to-one with CustomerOrder
    private CustomerOrder customerOrder;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "payment_status", nullable = false)
    private String paymentStatus;
}
