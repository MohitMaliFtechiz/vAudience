package com.vAudience.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vAudience.model.Address;
import com.vAudience.model.Contacts;
import com.vAudience.repository.AddressRepository;
import com.vAudience.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepository;

	@Autowired
	AddressRepository addressRepository;

	public List<Contacts> getAllContacts() {
		List<Contacts> contacts = new ArrayList<Contacts>();
		contactRepository.findAll().forEach(contacts1 -> contacts.add(contacts1));
		return contacts;
	}

//getting a specific record by using the method findById() of CrudRepository  
	public Contacts getContactsById(int id) {
		return contactRepository.findById(id).get();
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Contacts getContactsByPostalCode(int postalcode) {
		int addressid = addressRepository.getAdressByPostalCode(postalcode);
		Address address = addressRepository.findById(addressid).get();
		return contactRepository.findById(contactRepository.getContactByPostalCode(address)).get();
	}

//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Contacts contacts) {
		contactRepository.save(contacts);
	}

//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id) {
		contactRepository.deleteById(id);
	}

//updating a record  
	public void update(Contacts contacts, int contactsid) {
		contactRepository.save(contacts);
	}

}
