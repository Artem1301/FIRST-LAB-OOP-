package com.project.Banking.controller;

import com.project.Banking.model.CreditOffer;
import com.project.Banking.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CreditController {
    @Autowired
    private CreditService creditService;

    @GetMapping("/offers")
    public List<CreditOffer> getCreditOffers() {
        return creditService.getCreditOffers();
    }

    @GetMapping("/search")
    public List<CreditOffer> searchCreditOffers(
            @RequestParam(required = false) String bankName,
            @RequestParam(required = false) String earlyRepayment,
            @RequestParam(required = false) String increaseLimit) {

        List<CreditOffer> offers = creditService.getCreditOffers();
        List<CreditOffer> result = new ArrayList<>();

        for (CreditOffer offer : offers) {
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
}
