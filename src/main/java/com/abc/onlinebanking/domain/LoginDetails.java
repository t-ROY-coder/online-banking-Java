package com.abc.onlinebanking.domain;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")

public class LoginDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String loginId;
	
	@Column(name = "PASSWORD")
	private String password;
	
	//constructor
	public LoginDetails(){}
	public LoginDetails(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}
	
	//getter and setter methods
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
