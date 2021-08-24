package com.abc.onlinebanking.domain;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "INTEREST_RATE")

public class InterestRateDetails {

	@Id
	@Column(name = "ACC_TYPE")
	private String accountType;
	
	@Column(name = "INTEREST_RATE")
	private float interestRate;
	
	//constructor
	public InterestRateDetails(){}
	public InterestRateDetails(String accountType, float interestRate) {
		super();
		this.accountType = accountType;
		this.interestRate = interestRate;
	}
	
	//getter and setter methods
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
}
