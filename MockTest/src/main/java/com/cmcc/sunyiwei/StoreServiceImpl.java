/**
 * @Title: 	StoreServiceImpl.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月13日 上午10:45:17 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

/** 
 * @ClassName:	StoreServiceImpl 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年3月13日 上午10:45:17 
 *  
 */
public class StoreServiceImpl implements StoreService {

	private CarService carService;
	
	public Car getNewCar(String name, String vendor) {
		Car car = new Car();
		car.setName(name);
		car.setVendor(vendor);
		
		if(carService.check(car)){
			return car;
		}
		
		return null;
	}
}
