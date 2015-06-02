package com.cmcc.sunyiwei;

public class CalculateServiceProxy implements com.cmcc.sunyiwei.CalculateService {
  private String _endpoint = null;
  private com.cmcc.sunyiwei.CalculateService calculateService = null;
  
  public CalculateServiceProxy() {
    _initCalculateServiceProxy();
  }
  
  public CalculateServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculateServiceProxy();
  }
  
  private void _initCalculateServiceProxy() {
    try {
      calculateService = (new com.cmcc.sunyiwei.CalculateServiceServiceLocator()).getCalculateService();
      if (calculateService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculateService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculateService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculateService != null)
      ((javax.xml.rpc.Stub)calculateService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cmcc.sunyiwei.CalculateService getCalculateService() {
    if (calculateService == null)
      _initCalculateServiceProxy();
    return calculateService;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (calculateService == null)
      _initCalculateServiceProxy();
    return calculateService.add(a, b);
  }
  
  public int abs(int a) throws java.rmi.RemoteException{
    if (calculateService == null)
      _initCalculateServiceProxy();
    return calculateService.abs(a);
  }
  
  
}