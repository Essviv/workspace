package com.cmcc.sunyiwei.springframework;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestJavaCollection {
	private List<String> addressList;
	private Set<String> addressSet;
	private Map<String, String> addressMap;
	private Properties addressProperties;
	private String name;
	
	public List<String> getAddressList() {
		System.out.println("get address list: " + addressList);
		return addressList;
	}
	public void setAddressList(List<String> addressList) {
		System.out.println("set address list");
		this.addressList = addressList;
	}
	public Set<String> getAddressSet() {
		System.out.println("get address set: " + addressSet);
		return addressSet;
	}
	public void setAddressSet(Set<String> addressSet) {
		System.out.println("set address set");
		this.addressSet = addressSet;
	}
	public Map<String, String> getAddressMap() {
		System.out.println("get address map: " + addressMap);
		return addressMap;
	}
	public void setAddressMap(Map<String, String> addressMap) {
		System.out.println("set address map");
		this.addressMap = addressMap;
	}
	public Properties getAddressProperties() {
		System.out.println("get address properties: " + addressProperties);
		return addressProperties;
	}
	public void setAddressProperties(Properties addressProperties) {
		System.out.println("set address properties");
		this.addressProperties = addressProperties;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
