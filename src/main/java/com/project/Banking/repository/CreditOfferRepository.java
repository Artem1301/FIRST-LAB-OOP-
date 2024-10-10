package com.project.Banking.repository;

import com.project.Banking.model.CreditOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditOfferRepository extends JpaRepository<CreditOffer, Long> {
    List<CreditOffer> findByCreditTypeAndEarlyRepaymentAndCreditLimit(
            String creditType, Boolean earlyRepayment, Boolean creditLimit);
}
