package com.project.Banking.service;

import com.project.Banking.model.CreditOffer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CreditServiceTest {

    private CreditService creditService;

    @BeforeEach
    public void setUp() {
        creditService = new CreditService();
    }

    @Test
    public void testGetCreditOffers() {
        List<CreditOffer> offers = creditService.getCreditOffers();
        assertEquals(4, offers.size());
    }

    @Test
    public void testSearchCreditOffersByBankName() {
        List<CreditOffer> offers = creditService.searchCreditOffers("Bank 1");
        assertEquals(1, offers.size());
        assertEquals("Bank 1", offers.get(0).getBankName());
    }

    @Test
    public void testSearchCreditOffersByNonExistentBank() {
        List<CreditOffer> offers = creditService.searchCreditOffers("NonExistent Bank");
        assertEquals(0, offers.size());
    }
}
