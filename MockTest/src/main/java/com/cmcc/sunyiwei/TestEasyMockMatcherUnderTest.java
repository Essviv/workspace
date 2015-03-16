/**
 * @Title: 	TestEasyMockMatcherUnderTest.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月16日 上午9:44:15 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @ClassName: TestEasyMockMatcherUnderTest
 * @Description: TODO
 * @author: sunyiwei
 * @date: 2015年3月16日 上午9:44:15
 * 
 */
@RunWith(EasyMockRunner.class)
public class TestEasyMockMatcherUnderTest {
	@TestSubject
	private final ClassUnderTest easyMockMatcherUnderTest = new ClassUnderTest();

	@Mock
	private ServiceToMock mock;

	

	/**
	 * Test method for
	 * {@link com.cmcc.sunyiwei.EasyMockMatcherUnderTest#printObject(com.cmcc.sunyiwei.Car)}
	 * .
	 */
	@Test
	public void testOperateCar() {
		//record
		mock.operateCar(EasyMock.anyObject(Car.class));
		EasyMock.expectLastCall();

		// replay
		EasyMock.replay(mock);
		//matcher here...
		easyMockMatcherUnderTest.operateObject(EasyMock.anyObject(Car.class));
//		easyMockMatcherUnderTest.operateObject(new Car());

		// verify
		EasyMock.verify(mock);
	}
	
	/**
	 * Test method for
	 * {@link com.cmcc.sunyiwei.EasyMockMatcherUnderTest#printDouble(double)}.
	 */
	@Test
	public void testOperateDouble() {
		// record
		mock.operateDouble(EasyMock.anyDouble());
		EasyMock.expectLastCall();

		// replay
		EasyMock.replay(mock);
		easyMockMatcherUnderTest.operateDouble(EasyMock.anyDouble());

		// verify
		EasyMock.verify(mock);
	}
}
