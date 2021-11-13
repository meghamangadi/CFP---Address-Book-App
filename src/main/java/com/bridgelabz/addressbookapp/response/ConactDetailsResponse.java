package com.bridgelabz.addressbookapp.response;

import lombok.Data;

@Data
public class ConactDetailsResponse {
 
	private String contactId;
	private String firstName; 
	private String lastName; 
	private String address; 
	private String state; 
	private String city; 
	private String zip; 
	private String phone;
}
