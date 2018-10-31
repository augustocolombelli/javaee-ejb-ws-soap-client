package br.com.server;

import java.rmi.RemoteException;

import br.com.server.webservice.Person;
import br.com.server.webservice.PersonWS;
import br.com.server.webservice.PersonWSProxy;

public class RunClient {

	public static void main(String[] args) throws RemoteException {
		PersonWS personWS = new PersonWSProxy();
		
		for (Person person : personWS.getAllPersons()) {
			System.out.println("Id: " + person.getId());
			System.out.println("Name: " + person.getName());
		}
	}
	
}
