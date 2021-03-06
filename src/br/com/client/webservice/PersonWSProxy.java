package br.com.client.webservice;

public class PersonWSProxy implements br.com.client.webservice.PersonWS {
  private String _endpoint = null;
  private br.com.client.webservice.PersonWS personWS = null;
  
  public PersonWSProxy() {
    _initPersonWSProxy();
  }
  
  public PersonWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonWSProxy();
  }
  
  private void _initPersonWSProxy() {
    try {
      personWS = (new br.com.client.webservice.PersonWSServiceLocator()).getPersonWSPort();
      if (personWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personWS != null)
      ((javax.xml.rpc.Stub)personWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.client.webservice.PersonWS getPersonWS() {
    if (personWS == null)
      _initPersonWSProxy();
    return personWS;
  }
  
  public br.com.client.webservice.Person[] getAllPersons() throws java.rmi.RemoteException{
    if (personWS == null)
      _initPersonWSProxy();
    return personWS.getAllPersons();
  }
  
  
}