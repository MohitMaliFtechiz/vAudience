package com.vAudience.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vAudience.model.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

	@Query(value = "select id from Address where postalcode=?1")
	int getAdressByPostalCode(int postalcode);
}
