package com.abc.onlinebanking.domain;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TYPE")

public class UserTypeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userTypeId;
	
	@Column(name = "USER_TYPE")
	private String userType;
	
	//constructor
	public UserTypeDetails(){}
	public UserTypeDetails(long userTypeId, String userType) {
		super();
		this.userTypeId = userTypeId;
		this.userType = userType;
	}
	
	//getter and setter methods
	public long getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(long userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
