package com.project.Banking.service;

import com.project.Banking.model.CreditOffer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreditService {
    private final List<CreditOffer> creditOffers = new ArrayList<>();

    public CreditService() {
        creditOffers.add(new CreditOffer("Bank 1", 5.0, 10000, 24, true, false));
        creditOffers.add(new CreditOffer("Bank 2", 4.5, 20000, 36, false, true));
        creditOffers.add(new CreditOffer("Bank 3", 6.0, 15000, 12, true, true));
        creditOffers.add(new CreditOffer("Bank 4", 7.0, 13000, 6, false, false));
    }

    public List<CreditOffer> getCreditOffers() {
        return creditOffers;
    }

    public List<CreditOffer> searchCreditOffers(String bankName) {
        List<CreditOffer> result = new ArrayList<>();
        for (CreditOffer offer : creditOffers) {
            if (offer.getBankName().equalsIgnoreCase(bankName)) {
                result.add(offer);
            }
        }
        return result;
    }
}
