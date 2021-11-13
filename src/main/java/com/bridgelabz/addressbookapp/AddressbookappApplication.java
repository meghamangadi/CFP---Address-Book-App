package com.bridgelabz.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressbookappApplication {

	public static void main(String[] args) {
		log.info("Welcome to the Address Book");
		SpringApplication.run(AddressbookappApplication.class, args);
	}

}
