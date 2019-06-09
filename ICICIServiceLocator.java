package com.instance.serviceloader;
import com.service.stock.BSEStockManagerImp;
import com.service.stock.NSEStockManagerImp;
import com.service.stock.StockManager;

public class ICICIServiceLocator {
	public static ICICIServiceLocator instance;
	private StockManager stockManager;
	
	public static synchronized ICICIServiceLocator getInstance() {
		if(instance==null) {
			instance=new ICICIServiceLocator();
		}
		return instance;
	}
	public StockManager getService(String exchangeName) {
		
		if(exchangeName.equals("BSEStockManager")) {
			
			stockManager=new BSEStockManagerImp();
		}
		else if(exchangeName.equals("NSEStockManager")) {
			
			stockManager=new NSEStockManagerImp();
		}
		return stockManager;
		
	}
}
