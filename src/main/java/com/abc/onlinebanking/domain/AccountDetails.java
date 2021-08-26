package com.abc.onlinebanking.domain;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.*;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")

public class AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String accountNumber;
	
	@Column(name = "ACC_BALANCE")
	private float accountBalance;
	
	@Column(name = "DATE_CREATED")
	private LocalDate dateCreated;

	@JsonIgnore
	@ManyToOne
	private CustomerDetails customer;
	public CustomerDetails getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}

	//constructor
	public AccountDetails(){}
	public AccountDetails(String accountNumber, float accountBalance, LocalDate dateCreated, CustomerDetails customer) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.dateCreated = dateCreated;
		this.customer = customer;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}


}
