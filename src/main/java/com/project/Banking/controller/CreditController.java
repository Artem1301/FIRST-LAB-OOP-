package com.project.Banking.controller;

import com.project.Banking.model.CreditOffer;
import com.project.Banking.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public List<CreditOffer> searchCreditOffers(@RequestParam String bankName) {
        return creditService.searchCreditOffers(bankName);
    }
}
