package com.icici.provider;

import com.service.stock.StockManager;

public class ICICIGetStock {

	private StockManager stockManager;

	public void getStockManager(String stockName) {
		
		double price = stockManager.getPrice(stockName);
		System.out.println(price);
	}

	public void setStockManager(StockManager stockManager) {
		this.stockManager = stockManager;
	}

	
	
}
