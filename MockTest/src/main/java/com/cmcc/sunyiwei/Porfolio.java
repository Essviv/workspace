/**
 * @Title: 	Porfolio.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月11日 下午1:53:39 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

import java.util.ArrayList;
import java.util.List;


/** 
 * @ClassName:	Porfolio 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月11日 下午1:53:39 
 *  
 */
public class Porfolio {
	private String name;
	private IStockMarket stockMarket;
	private List<Stock> stocks = new ArrayList<Stock>();
	
	public int getTotalValue(){
		int nSum = 0;
		for (Stock stock : stocks) {
			nSum += stockMarket.getPrice(stock.getName()) * stock.getQuantity();
		}
		
		return nSum;
	}
	
	public void addStock(Stock stock){
		stocks.add(stock);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IStockMarket getStockMarket() {
		return stockMarket;
	}
	public void setStockMarket(IStockMarket stockMarket) {
		this.stockMarket = stockMarket;
	}
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	
}
