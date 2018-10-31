/**
 * PersonWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.server.webservice;

public interface PersonWSService extends javax.xml.rpc.Service {
    public java.lang.String getPersonWSPortAddress();

    public br.com.server.webservice.PersonWS getPersonWSPort() throws javax.xml.rpc.ServiceException;

    public br.com.server.webservice.PersonWS getPersonWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
