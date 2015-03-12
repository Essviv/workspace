package com.cmcc.sunyiwei;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class JavaCollection {
	private List listData;
	private Set setData;
	private Map mapData;
	private Properties propsData;
	
	/**
	 * @return the listData
	 */
	public List getListData() {
		System.out.println("List Data: " + listData);
		return listData;
	}
	
	/**
	 * @param listData the listData to set
	 */
	public void setListData(List listData) {
		this.listData = listData;
	}
	
	/**
	 * @return the setData
	 */
	public Set getSetData() {
		System.out.println("Set Data: " + setData);
		return setData;
	}
	
	/**
	 * @param setData the setData to set
	 */
	public void setSetData(Set setData) {
		this.setData = setData;
	}
	
	/**
	 * @return the mapData
	 */
	public Map getMapData() {
		System.out.println("Map data: " + mapData);
		return mapData;
	}
	
	/**
	 * @param mapData the mapData to set
	 */
	public void setMapData(Map mapData) {
		this.mapData = mapData;
	}
	
	/**
	 * @return the propsData
	 */
	public Properties getPropsData() {
		System.out.println("Props Data: " + propsData);
		return propsData;
	}
	
	/**
	 * @param propsData the propsData to set
	 */
	public void setPropsData(Properties propsData) {
		this.propsData = propsData;
	}
	
	
}
