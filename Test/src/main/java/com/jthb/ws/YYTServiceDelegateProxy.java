package com.jthb.ws;

public class YYTServiceDelegateProxy implements com.jthb.ws.YYTServiceDelegate {
  private String _endpoint = null;
  private com.jthb.ws.YYTServiceDelegate yYTServiceDelegate = null;
  
  public YYTServiceDelegateProxy() {
    _initYYTServiceDelegateProxy();
  }
  
  public YYTServiceDelegateProxy(String endpoint) {
    _endpoint = endpoint;
    _initYYTServiceDelegateProxy();
  }
  
  private void _initYYTServiceDelegateProxy() {
    try {
      yYTServiceDelegate = (new com.jthb.ws.YYTServiceServiceLocator()).getYYTServicePort();
      if (yYTServiceDelegate != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)yYTServiceDelegate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)yYTServiceDelegate)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (yYTServiceDelegate != null)
      ((javax.xml.rpc.Stub)yYTServiceDelegate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jthb.ws.YYTServiceDelegate getYYTServiceDelegate() {
    if (yYTServiceDelegate == null)
      _initYYTServiceDelegateProxy();
    return yYTServiceDelegate;
  }
  
  public java.lang.String gettoken(java.lang.String arg0) throws java.rmi.RemoteException{
    if (yYTServiceDelegate == null)
      _initYYTServiceDelegateProxy();
    return yYTServiceDelegate.gettoken(arg0);
  }
  
  public java.lang.String getchecktoken(java.lang.String arg0) throws java.rmi.RemoteException{
    if (yYTServiceDelegate == null)
      _initYYTServiceDelegateProxy();
    return yYTServiceDelegate.getchecktoken(arg0);
  }
  
  
}