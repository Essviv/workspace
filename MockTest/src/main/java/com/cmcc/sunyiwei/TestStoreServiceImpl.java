/**
 * @Title: 	TestStoreServiceImpl.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月13日 上午10:49:19 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @ClassName: TestStoreServiceImpl
 * @Description: TODO
 * @author: sunyiwei
 * @date: 2015年3月13日 上午10:49:19
 * 
 */
@RunWith(EasyMockRunner.class)
public class TestStoreServiceImpl {
	@TestSubject
	private final StoreService service = new StoreServiceImpl();

	@Mock
	private CarService carService;

	/**
	 * Test method for
	 * {@link com.cmcc.sunyiwei.StoreServiceImpl#getNewCar(java.lang.String)}.
	 */
	@Test
	public void testGetNewCar() {
		//record
//		EasyMock.expect(carService.check(EasyMock.anyObject(Car.class))).andReturn(true);
		EasyMock.expect(carService.check(EasyMock.isA(Car.class))).andReturn(true);
		
		//replay
		EasyMock.replay(carService);
		assertNotNull(service.getNewCar("A6", "Audi"));
		
		//verify
		EasyMock.verify(carService);
	}
}
