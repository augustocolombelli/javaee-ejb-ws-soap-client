/**
 * PersonWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.server.webservice;

public class PersonWSServiceLocator extends org.apache.axis.client.Service implements br.com.server.webservice.PersonWSService {

    public PersonWSServiceLocator() {
    }


    public PersonWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PersonWSPort
    private java.lang.String PersonWSPort_address = "http://localhost:8080/javaee-ejb-ws-soap-server/PersonWS";

    public java.lang.String getPersonWSPortAddress() {
        return PersonWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PersonWSPortWSDDServiceName = "PersonWSPort";

    public java.lang.String getPersonWSPortWSDDServiceName() {
        return PersonWSPortWSDDServiceName;
    }

    public void setPersonWSPortWSDDServiceName(java.lang.String name) {
        PersonWSPortWSDDServiceName = name;
    }

    public br.com.server.webservice.PersonWS getPersonWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PersonWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonWSPort(endpoint);
    }

    public br.com.server.webservice.PersonWS getPersonWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.server.webservice.PersonWSServiceSoapBindingStub _stub = new br.com.server.webservice.PersonWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPersonWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonWSPortEndpointAddress(java.lang.String address) {
        PersonWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.server.webservice.PersonWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.server.webservice.PersonWSServiceSoapBindingStub _stub = new br.com.server.webservice.PersonWSServiceSoapBindingStub(new java.net.URL(PersonWSPort_address), this);
                _stub.setPortName(getPersonWSPortWSDDServiceName());
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
        if ("PersonWSPort".equals(inputPortName)) {
            return getPersonWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.server.com.br/", "PersonWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.server.com.br/", "PersonWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PersonWSPort".equals(portName)) {
            setPersonWSPortEndpointAddress(address);
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
