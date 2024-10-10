package com.project.Banking.controller;

import com.project.Banking.model.CreditOffer;
import com.project.Banking.service.CreditOfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credit-offers")
@CrossOrigin(origins = "*") // Дозволяємо запити з інших джерел
public class CreditOfferController {

    private final CreditOfferService creditOfferService;

    public CreditOfferController(CreditOfferService creditOfferService) {
        this.creditOfferService = creditOfferService;
    }

    @GetMapping
    public List<CreditOffer> getAllOffers() {
        return creditOfferService.getAllOffers();
    }

    @GetMapping("/filter")
    public List<CreditOffer> getFilteredOffers(
            @RequestParam String creditType,
            @RequestParam Boolean earlyRepayment,
            @RequestParam Boolean creditLimit) {
        return creditOfferService.getFilteredOffers(creditType, earlyRepayment, creditLimit);
    }

    @PostMapping
    public CreditOffer createOffer(@RequestBody CreditOffer offer) {
        return creditOfferService.saveOffer(offer);
    }
}
