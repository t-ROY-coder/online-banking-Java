package com.abc.onlinebanking.domain;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.time.*;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "PERSONS")

public class CustomerDetails {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String customerId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DATE_OF_BIRTH")
	private LocalDate dateOfBirth;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "CITY")
	private String city;

	@Column(name = "PHONE")
	private long phone;

	public CustomerDetails(){}

	public CustomerDetails(String customerId, String name, LocalDate dateOfBirth, String address, String city, long phone) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dateOfBirth=dateOfBirth;
		this.address = address;
		this.city = city;
		this.phone = phone;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
