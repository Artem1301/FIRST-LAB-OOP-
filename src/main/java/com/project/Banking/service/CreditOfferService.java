package com.project.Banking.service;

import com.project.Banking.model.CreditOffer;
import com.project.Banking.repository.CreditOfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditOfferService {

    private final CreditOfferRepository creditOfferRepository;

    public CreditOfferService(CreditOfferRepository creditOfferRepository) {
        this.creditOfferRepository = creditOfferRepository;
    }

    public List<CreditOffer> getFilteredOffers(String creditType, Boolean earlyRepayment, Boolean creditLimit) {
        return creditOfferRepository.findByCreditTypeAndEarlyRepaymentAndCreditLimit(
                creditType, earlyRepayment, creditLimit);
    }

    public List<CreditOffer> getAllOffers() {
        return creditOfferRepository.findAll();
    }

    public CreditOffer saveOffer(CreditOffer offer) {
        return creditOfferRepository.save(offer);
    }
}
