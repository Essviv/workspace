/**
 * @Title: 	TestPorfolio.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月11日 下午1:57:53 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;

/** 
 * @ClassName:	TestPorfolio 
 * @Description:  学习EasyMock的测试方法
 * @author:	sunyiwei
 * @date:	2015年3月11日 下午1:57:53 
 *  
 */
public class TestPorfolio extends TestCase{

	@TestSubject
	private final Porfolio porfolio = new Porfolio();
	
	@Mock
	private IStockMarket stockMarket;
	
	@Override
	protected void setUp() throws Exception {
		stockMarket = EasyMock.createMock(IStockMarket.class);
		porfolio.setStockMarket(stockMarket);
	}
	
	/**
	 * Test method for {@link com.cmcc.sunyiwei.Porfolio#getTotalValue()}.
	 */
	@Test
	public void testGetTotalValue() {
		//record expected behaviour
		EasyMock.expect(stockMarket.getPrice("EBAY")).andReturn(42).times(2);
		
		//test
		EasyMock.replay(stockMarket);
		Stock stock = new Stock("EBAY", 2);
		porfolio.addStock(stock);
		assertEquals(84,  porfolio.getTotalValue());
		EasyMock.verify(stockMarket);
	}
}
