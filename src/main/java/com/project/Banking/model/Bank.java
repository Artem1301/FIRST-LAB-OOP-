package com.project.Banking.model;

import lombok.*;

@Data
@Builder
public class Bank {
    @NonNull
    private String name;
    private int maximumAmount;
    private int interestRate;
    private boolean earlyRepayment;
    private boolean increasingCreditLine;
}
