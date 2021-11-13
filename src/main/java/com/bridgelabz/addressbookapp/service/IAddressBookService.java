package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.model.ContactInfo;
import com.bridgelabz.addressbookapp.response.Response;

public interface IAddressBookService {
	
	public Response saveContacts(ContactInfo contactInfo);
	public Response getContactByID(Long Id);
	public Response getContactDetailsByID(String token);
	public Response updateContactByID(String token,ContactInfo contactInfo);
	public Response deleteContactByID(String token);
	public  Response getAllContact();
	
}
