package com.bridgelabz.addressbookapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
 
 

 
@Entity
@Data
public class AddressBookEntity {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long contactId;
	    private String firstName;
	    private String lastName;
	    private String address;
	    private String state;
	    private String city;
	    private String zip;
	    private String phone;		 
	    
}
