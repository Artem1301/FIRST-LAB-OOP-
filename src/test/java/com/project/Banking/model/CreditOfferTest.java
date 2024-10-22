package com.project.Banking.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditOfferTest {

    @Test
    public void testCreditOfferCreation() {
        CreditOffer offer = new CreditOffer(1, "Bank 1", 5.0, 10000, 24, true, false);

        assertEquals(1, offer.getId());
        assertEquals("Bank 1", offer.getBankName());
        assertEquals(5.0, offer.getInterestRate());
        assertEquals(10000, offer.getAmount());
        assertEquals(24, offer.getTerm());
        assertTrue(offer.isEarlyRepayment());
        assertFalse(offer.isIncreaseLimit());
    }
}