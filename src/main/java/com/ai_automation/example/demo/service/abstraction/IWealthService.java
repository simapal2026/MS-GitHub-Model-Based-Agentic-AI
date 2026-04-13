package com.ai_automation.example.demo.service.abstraction;

import java.math.BigDecimal;
import java.util.Map;

import com.ai_automation.example.demo.model.Wealth;

public interface IWealthService {
	
	void newWealthRecord(Long userId);

	Wealth findWealth(Long userId);
	
	Map<String, Double> getCurrencyRates();

	void makeWealthExchange(Long userId, String currency, BigDecimal amount, boolean isBuying);
	
	void makeWealthTransaction(Long userId, String currency, BigDecimal amount, boolean isIncrementing);

}