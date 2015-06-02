/**
 * YYTServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jthb.ws;

public class YYTServiceServiceLocator extends org.apache.axis.client.Service implements com.jthb.ws.YYTServiceService {

    public YYTServiceServiceLocator() {
    }


    public YYTServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public YYTServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for YYTServicePort
    private java.lang.String YYTServicePort_address = "http://www.xz139.net:56565/yyt/YYTServicePort";

    public java.lang.String getYYTServicePortAddress() {
        return YYTServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String YYTServicePortWSDDServiceName = "YYTServicePort";

    public java.lang.String getYYTServicePortWSDDServiceName() {
        return YYTServicePortWSDDServiceName;
    }

    public void setYYTServicePortWSDDServiceName(java.lang.String name) {
        YYTServicePortWSDDServiceName = name;
    }

    public com.jthb.ws.YYTServiceDelegate getYYTServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(YYTServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getYYTServicePort(endpoint);
    }

    public com.jthb.ws.YYTServiceDelegate getYYTServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jthb.ws.YYTServicePortBindingStub _stub = new com.jthb.ws.YYTServicePortBindingStub(portAddress, this);
            _stub.setPortName(getYYTServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setYYTServicePortEndpointAddress(java.lang.String address) {
        YYTServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jthb.ws.YYTServiceDelegate.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jthb.ws.YYTServicePortBindingStub _stub = new com.jthb.ws.YYTServicePortBindingStub(new java.net.URL(YYTServicePort_address), this);
                _stub.setPortName(getYYTServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("YYTServicePort".equals(inputPortName)) {
            return getYYTServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.jthb.com/", "YYTServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.jthb.com/", "YYTServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("YYTServicePort".equals(portName)) {
            setYYTServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
