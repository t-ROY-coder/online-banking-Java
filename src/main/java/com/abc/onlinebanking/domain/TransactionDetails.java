package com.abc.onlinebanking.domain;
import java.time.*;
import javax.persistence.*;

@Entity
@Table(name = "TRANSACTION")

public class TransactionDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionId;
	
	@Column(name = "AMOUNT")
	private float transactionAmount;
	
	@Column(name = "DATE_OF_TRANSACTION")
	private LocalDate transactionDate;
	
	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;
	
	@Column(name = "TO_ACCOUNT")
	private String transactionToAccount; // transferred to which account
	
	//constructor
	public TransactionDetails(){}
	public TransactionDetails(long transactionId, float transactionAmount, LocalDate transactionDate,
			String transactionType, String transactionToAccount) {
		super();
		this.transactionId = transactionId;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.transactionToAccount = transactionToAccount;
	}
	
	//getter and setter methods
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public float getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionToAccount() {
		return transactionToAccount;
	}
	public void setTransactionToAccount(String transactionToAccount) {
		this.transactionToAccount = transactionToAccount;
	}
}
