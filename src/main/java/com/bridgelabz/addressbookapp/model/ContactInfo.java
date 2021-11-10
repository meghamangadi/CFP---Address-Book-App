package com.bridgelabz.addressbookapp.model;

import lombok.Data;

@Data
public class ContactInfo {

	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String city;
	private String zip;
	private String phone; 
}
