package com.vAudience.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table(name = "address")
public class Address {
	
	// defining id as column name
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	// defining city as column name
	@Column
	private String city;
	// defining postalcode as column name
	@Column
	private int postalcode;
	
	@OneToOne(mappedBy = "address")
    private Contacts contacts;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

}
