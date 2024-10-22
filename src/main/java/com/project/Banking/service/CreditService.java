package com.project.Banking.service;

import com.project.Banking.model.CreditOffer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreditService {
    private final List<CreditOffer> creditOffers = new ArrayList<>();

    public CreditService() {
        creditOffers.add(new CreditOffer(1, "Bank 1", 5.0, 10000, 24, true, false));
        creditOffers.add(new CreditOffer(2, "Bank 2", 4.5, 20000, 36, false, true));
        creditOffers.add(new CreditOffer(3, "Bank 3", 6.0, 15000, 12, true, true));
        creditOffers.add(new CreditOffer(4, "Bank 4", 7.0, 13000, 6, false, false));
    }

    public List<CreditOffer> getCreditOffers() {
        return creditOffers;
    }

    public List<CreditOffer> searchCreditOffers(String bankName, String earlyRepayment, String increaseLimit) {
        List<CreditOffer> result = new ArrayList<>();
        for (CreditOffer offer : creditOffers) {
            boolean matches = true;

            if (bankName != null && !bankName.isEmpty() && !offer.getBankName().equalsIgnoreCase(bankName)) {
                matches = false;
            }
            if (earlyRepayment != null && !earlyRepayment.isEmpty() &&
                    offer.isEarlyRepayment() != Boolean.parseBoolean(earlyRepayment)) {
                matches = false;
            }
            if (increaseLimit != null && !increaseLimit.isEmpty() &&
                    offer.isIncreaseLimit() != Boolean.parseBoolean(increaseLimit)) {
                matches = false;
            }

            if (matches) {
                result.add(offer);
            }
        }
        return result;
    }

    public List<CreditOffer> searchCreditOffers(String bankName) {
        return searchCreditOffers(bankName, null, null);
    }

}
