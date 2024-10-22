package com.project.Banking.model;

public class CreditOffer {
    private int id;
    private String bankName;
    private double interestRate;
    private double amount;
    private int term; // in months
    private boolean earlyRepayment;
    private boolean increaseLimit;

    public CreditOffer(int id, String bankName, double interestRate, double amount, int term, boolean earlyRepayment, boolean increaseLimit) {
        this.id = id;
        this.bankName = bankName;
        this.interestRate = interestRate;
        this.amount = amount;
        this.term = term;
        this.earlyRepayment = earlyRepayment;
        this.increaseLimit = increaseLimit;
    }

    public int getId() { return id; }

    public String getBankName() {
        return bankName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public int getTerm() {
        return term;
    }

    public boolean isEarlyRepayment() {
        return earlyRepayment;
    }

    public boolean isIncreaseLimit() {
        return increaseLimit;
    }
}
