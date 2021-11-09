package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbookapp.entity.AddressBookEntity;

@Repository
public interface IAddressBookRepository extends CrudRepository<AddressBookEntity, Long> {

}
