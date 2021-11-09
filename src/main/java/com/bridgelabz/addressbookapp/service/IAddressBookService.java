package com.bridgelabz.addressbookapp.service;

import java.util.List;

import com.bridgelabz.addressbookapp.model.ContactInfo;
import com.bridgelabz.addressbookapp.response.Response;

public interface IAddressBookService {
	
	public Response saveContacts(ContactInfo contactInfo);
	public Response getContactByID(Long Id);
	public Response updateContactByID(Long Id,ContactInfo contactInfo);
	public Response deleteContactByID(Long Id);
	public  Response getAllContact();
	
}
