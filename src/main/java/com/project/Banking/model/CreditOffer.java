package com.project.Banking.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "credit_offers")
@Data
public class CreditOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bank_name", nullable = false)
    private String bankName;

    @Column(name = "credit_type", nullable = false)
    private String creditType;

    @Column(name = "interest_rate", nullable = false)
    private Double interestRate;

    @Column(name = "max_amount", nullable = false)
    private Long maxAmount;

    @Column(name = "early_repayment", nullable = false)
    private Boolean earlyRepayment;

    @Column(name = "credit_limit", nullable = false)
    private Boolean creditLimit;
}
