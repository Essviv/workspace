/**
 * @Title: 	TestPartialMock.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月16日 上午9:19:41 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;

import org.easymock.EasyMock;
import org.easymock.internal.MockBuilder;
import org.junit.Test;

/**
 * @ClassName: TestPartialMock
 * @Description: TODO
 * @author: sunyiwei
 * @date: 2015年3月16日 上午9:19:41
 * 
 */
public class TestPartialMock {

	/**
	 * Test method for
	 * {@link com.cmcc.sunyiwei.PartialMockClassUnderTest#execute()}.
	 */
	@Test
	public void testExecute() {
		PartialMockClassUnderTest classUnderTest = EasyMock.createMockBuilder(
				PartialMockClassUnderTest.class).addMockedMethod("sayWorld").createMock();
		
		//record
		classUnderTest.sayWorld();
		expectLastCall();
		
		//replay
		replay(classUnderTest);
		classUnderTest.execute();
		
		//verify
		verify(classUnderTest);
	}

}
