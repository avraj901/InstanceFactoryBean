package com.instance.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.icici.provider.ICICIGetStock;
import com.service.stock.StockManager;

public class Test {

	public static void main(String[] args) {
      
	   BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/instance/common/application-context.xml"));
	   ICICIGetStock stock = factory.getBean("getStock", ICICIGetStock.class);
	   stock.getStockManager("BSEStockManager");
	}

}
