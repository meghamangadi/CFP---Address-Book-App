package com.bridgelabz.addressbookapp.service;

import java.util.List;
import java.util.Optional;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.entity.AddressBookEntity;
import com.bridgelabz.addressbookapp.model.ContactInfo;
import com.bridgelabz.addressbookapp.repository.IAddressBookRepository;
import com.bridgelabz.addressbookapp.response.ConactDetailsResponse;
import com.bridgelabz.addressbookapp.response.Response;
import com.bridgelabz.addressbookapp.utils.TokenUtils; 

@Service

public class AddressBookServiceImpl implements IAddressBookService {
	
	@Autowired
	private IAddressBookRepository addressBookRepository;
	 @Autowired
	 private TokenUtils tokenUtils;
	@Override
	public Response saveContacts(ContactInfo contactInfo) {
		AddressBookEntity address=new AddressBookEntity();
		address.setFirstName(contactInfo.getFirstName());
		address.setLastName(contactInfo.getLastName());
		address.setPhone(contactInfo.getPhone());
		address.setState(contactInfo.getState());
		address.setAddress(contactInfo.getAddress());
		address.setCity(contactInfo.getCity());
		address.setZip(contactInfo.getZip());		
		addressBookRepository.save(address);
		return new  Response(200 ,"Contact added Successfully..!!");
	}

	@Override
	public Response getContactByID(Long Id) {
		Optional<AddressBookEntity> contact=addressBookRepository.findById(Id);
		ConactDetailsResponse contactDetails=new ConactDetailsResponse();
		contactDetails.setAddress(contact.get().getAddress());
		contactDetails.setCity(contact.get().getCity());
		contactDetails.setContactId(tokenUtils.createToken(contact.get().getContactId()));
		contactDetails.setFirstName(contact.get().getFirstName());
		contactDetails.setLastName(contact.get().getLastName());
		contactDetails.setPhone(contact.get().getPhone());
		contactDetails.setState(contact.get().getState());
		contactDetails.setZip(contact.get().getZip());
		return  new  Response(200 ,"Retrived Contact Details succesfully..!!",contactDetails);
	}

	@Override
	public Response updateContactByID(String token,ContactInfo contactInfo) {
		Long Id=tokenUtils.decodeToken(token);
		Optional<AddressBookEntity> contact=addressBookRepository.findById(Id);
		if(contact.isPresent()) {
			AddressBookEntity address=new AddressBookEntity();
			address.setFirstName(contactInfo.getFirstName());
			address.setLastName(contactInfo.getLastName());
			address.setPhone(contactInfo.getPhone());
			address.setState(contactInfo.getState());
			address.setAddress(contactInfo.getAddress());
			address.setCity(contactInfo.getCity());
			address.setZip(contactInfo.getZip());		
			addressBookRepository.save(address);			 
			return new  Response(200 ,"Conatct Details Updated Succesfully..!!"); 
		}
 		  return new  Response(500 ,"Fail to update the Contact Detail!"); 
	}

	@Override
	public Response deleteContactByID(String token) {
		Long Id=tokenUtils.decodeToken(token);
		addressBookRepository.deleteById(Id);
		return new  Response(200 ,"Conatct Details Deleted Succesfully..!!");
	}

	@Override
	public  Response getAllContact() {
		List<AddressBookEntity> contacts=  (List<AddressBookEntity>) addressBookRepository.findAll();
		 
		return new  Response(200 ,"Conatct Details Deleted Succesfully..!!",contacts);
	}

	@Override
	public Response getContactDetailsByID(String token) {
		Long Id=tokenUtils.decodeToken(token);
		Optional<AddressBookEntity> contact=addressBookRepository.findById(Id);
		ConactDetailsResponse contactDetails=new ConactDetailsResponse();
		contactDetails.setAddress(contact.get().getAddress());
		contactDetails.setCity(contact.get().getCity());
		contactDetails.setContactId(token);
		contactDetails.setFirstName(contact.get().getFirstName());
		contactDetails.setLastName(contact.get().getLastName());
		contactDetails.setPhone(contact.get().getPhone());
		contactDetails.setState(contact.get().getState());
		contactDetails.setZip(contact.get().getZip());		 
		return  new  Response(200 ,"Retrived Contact Details succesfully..!!",contactDetails);
	}

	 

}
