package com.bridgelabz.addressbookapp.model;

import lombok.Data;
import javax.validation.constraints.Pattern;

@Data
public class ContactInfo {

	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "FirstName is invalid")
	private String firstName;
	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "LastName is invalid")
	private String lastName;
	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "Address is invalid")
	private String address;
	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "State is invalid")
	private String state;
	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "Zip is invalid")
	private String city;
	@Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$", message = "Invalid Zip")
	private String zip;
	@Pattern(regexp = "^^[0-9]{2}?[\\s,-]{0,1}[7-9]{1}[0-9]{9}$", message = "Invalid Phone number")
	private String phone;
}
