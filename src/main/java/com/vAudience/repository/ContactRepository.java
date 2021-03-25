package com.vAudience.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vAudience.model.Address;
import com.vAudience.model.Contacts;

@Repository
public interface ContactRepository extends CrudRepository<Contacts, Integer> {
	@Query(value = "select id from Contacts  where address=?1")
	int getContactByPostalCode(Address address);
  
}
