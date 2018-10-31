package br.com.client;

import java.rmi.RemoteException;

import br.com.client.webservice.Person;
import br.com.client.webservice.PersonWS;
import br.com.client.webservice.PersonWSProxy;

public class RunClient {

	public static void main(String[] args) throws RemoteException {
		PersonWS personWS = new PersonWSProxy();
		
		for (Person person : personWS.getAllPersons()) {
			System.out.println("Id: " + person.getId());
			System.out.println("Name: " + person.getName());
		}
	}
	
}
