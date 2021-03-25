package com.vAudience.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vAudience.model.Contacts;
import com.vAudience.service.ContactService;

//mark class as Controller  
@RestController
public class ContactController {

	static Logger logger = Logger.getLogger(ContactController.class.getName());

//autowire the ContactService class  
	@Autowired
	ContactService contactService;

//creating a get mapping that retrieves all the contacts detail from the database   
	@GetMapping("/getcontacts")
	private List<Contacts> getAllContacts() {
		logger.log(Level.INFO, "REQUEST RECEIVED FOR RETERIVING ALL CONTACTS");
		return contactService.getAllContacts();
	}

	// creating a get mapping that retrieves the detail of a specific contacts
	@GetMapping("/contact/{id}")
	private Contacts getContact(@PathVariable("id") int id) {
		logger.log(Level.INFO, "REQUEST RECEIVED FOR RETERIVING  CONTACTS WITH ID=" + id);
		return contactService.getContactsById(id);
	}

	// creating a get mapping that retrieves the detail of a specific contacts
	@GetMapping("/contact/postalcode/{postalcode}")
	private Contacts getContactByPostalCode(@PathVariable("postalcode") int postalcode) {
		logger.log(Level.INFO, "REQUEST RECEIVED FOR RETERIVING  CONTACTS WITH POSTAL CODE=" + postalcode);
		return contactService.getContactsByPostalCode(postalcode);
	}

	// creating a delete mapping that deletes a specified contacts
	@DeleteMapping("/contact/{id}")
	private void deleteContact(@PathVariable("id") int id) {
		logger.log(Level.INFO, "REQUEST RECEIVED FOR DELETE  CONTACTS WITH ID=" + id);
		contactService.delete(id);
	}

	// creating post mapping that post the contacts detail in the database
	@PostMapping("/contacts")
	private long saveContacts(@RequestBody Contacts contacts) {
		logger.log(Level.INFO,
				"REQUEST RECEIVED FOR CREATE  CONTACTS WITH data dob= " + contacts.getDob() + " fullname= "
						+ contacts.getFullname() + " city= " + contacts.getAddress().getCity() + " postalcode= "
						+ contacts.getAddress().getPostalcode());
		contactService.saveOrUpdate(contacts);
		return contacts.getId();
	}

	// creating put mapping that updates the book detail
	@PutMapping("/contacts")
	private Contacts update(@RequestBody Contacts contacts) {
		logger.log(Level.INFO,
				"REQUEST RECEIVED FOR CREATE  CONTACTS WITH data dob= " + contacts.getDob() + " fullname= "
						+ contacts.getFullname() + " city= " + contacts.getAddress().getCity() + " postalcode= "
						+ contacts.getAddress().getPostalcode() + " id= " + contacts.getId());
		contactService.saveOrUpdate(contacts);
		return contacts;
	}

}
