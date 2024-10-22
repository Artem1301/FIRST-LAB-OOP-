package com.project.Banking;

import com.project.Banking.service.CreditService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BankingApplicationTests {

	@Autowired
	private CreditService creditService;

	@Test
	void contextLoads() {
	}

	@Test
	void testCreditServiceBean() {
		assertNotNull(creditService, "CreditService should not be null");
	}
}
